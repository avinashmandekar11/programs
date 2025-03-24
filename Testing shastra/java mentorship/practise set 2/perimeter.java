//Program to calculate area and perimetter of circle
// Area = pir*r*r;
//perimeter = 2*pie*r
import java.util.Scanner;
public class perimeter{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		double pie=3.14;
		System.out.println("Enter Value Of Radius");
		int r = sc.nextInt();
		
		double Area = pie*r*r;
		double perimeter = 2*pie*r;
		
		System.out.println("Area of circle is "+Area);
				System.out.println("Perimeter of circle is "+perimeter);

		
	}
	
}