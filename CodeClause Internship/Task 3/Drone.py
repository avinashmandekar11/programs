import numpy as np
import cv2
from dronekit import connect, VehicleMode, LocationGlobalRelative
import time
import math
from queue import PriorityQueue
from collections.abc import MutableMapping


# Function for obstacle detection using OpenCV (simplified for this example)
def detect_obstacle(frame):
    # Convert image to grayscale and detect edges
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    edges = cv2.Canny(gray, 50, 150)
    
    # Find contours (potential obstacles)
    contours, _ = cv2.findContours(edges, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)
    obstacle_detected = False
    
    for cnt in contours:
        area = cv2.contourArea(cnt)
        if area > 500:  # Threshold to identify significant obstacles
            obstacle_detected = True
            break
    
    return obstacle_detected

# A* Path Planning (Simplified for 2D grid)
def a_star(grid, start, goal):
    open_list = PriorityQueue()
    open_list.put((0, start))
    came_from = {}
    g_score = {start: 0}
    
    while not open_list.empty():
        current = open_list.get()[1]
        
        if current == goal:
            path = []
            while current in came_from:
                path.append(current)
                current = came_from[current]
            path.reverse()
            return path

        for neighbor in get_neighbors(grid, current):
            tentative_g_score = g_score[current] + 1
            if neighbor not in g_score or tentative_g_score < g_score[neighbor]:
                came_from[neighbor] = current
                g_score[neighbor] = tentative_g_score
                f_score = tentative_g_score + heuristic(neighbor, goal)
                open_list.put((f_score, neighbor))
    
    return []

def get_neighbors(grid, node):
    neighbors = []
    x, y = node
    for dx, dy in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
        new_x, new_y = x + dx, y + dy
        if 0 <= new_x < len(grid) and 0 <= new_y < len(grid[0]) and grid[new_x][new_y] == 0:
            neighbors.append((new_x, new_y))
    return neighbors

def heuristic(a, b):
    return abs(a[0] - b[0]) + abs(a[1] - b[1])

# Drone Navigation System (using DroneKit)
def connect_drone(connection_str):
    vehicle = connect(connection_str, wait_ready=True)
    return vehicle

def arm_and_takeoff(vehicle, altitude):
    while not vehicle.is_armable:
        print("Waiting for vehicle to become armable...")
        time.sleep(1)
    
    vehicle.mode = VehicleMode("GUIDED")
    vehicle.armed = True
    
    while not vehicle.armed:
        print("Waiting for vehicle to arm...")
        time.sleep(1)

    vehicle.simple_takeoff(altitude)
    
    while True:
        print(f"Altitude: {vehicle.location.global_relative_frame.alt}")
        if vehicle.location.global_relative_frame.alt >= altitude * 0.95:
            print("Reached target altitude")
            break
        time.sleep(1)

def navigate_to_location(vehicle, location):
    vehicle.simple_goto(LocationGlobalRelative(location[0], location[1], location[2]))

def avoid_obstacles(vehicle, current_location, target_location, camera):
    while True:
        ret, frame = camera.read()
        if detect_obstacle(frame):
            print("Obstacle detected! Adjusting path...")
            new_target = calculate_new_path(current_location, target_location)
            navigate_to_location(vehicle, new_target)
        else:
            print("No obstacles, proceeding to destination...")
            navigate_to_location(vehicle, target_location)
            break

def calculate_new_path(current_location, target_location):
    grid = np.zeros((100, 100))  # Example grid (you'll create this from SLAM data)
    start = (int(current_location[0]), int(current_location[1]))
    goal = (int(target_location[0]), int(target_location[1]))
    
    path = a_star(grid, start, goal)
    return path[0] if path else target_location

def main():
    # Connect to the drone
    vehicle = connect_drone('127.0.0.1:14550')  # Replace with real drone connection string
    arm_and_takeoff(vehicle, 10)
    
    # Open camera
    camera = cv2.VideoCapture(0)
    
    # Define target location (latitude, longitude, altitude)
    target_location = (35.363261, 149.165230, 20)  # Example location
    
    # Current location (use GPS or simulated position)
    current_location = (vehicle.location.global_frame.lat, vehicle.location.global_frame.lon, vehicle.location.global_relative_frame.alt)
    
    # Avoid obstacles and navigate
    avoid_obstacles(vehicle, current_location, target_location, camera)
    
    # Close camera
    camera.release()
    cv2.destroyAllWindows()

if __name__ == '__main__':
    main()
