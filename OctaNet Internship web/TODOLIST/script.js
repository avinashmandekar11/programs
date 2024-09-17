// script.js

document.getElementById('add-btn').addEventListener('click', addTask);

function addTask() {
    const taskText = document.getElementById('todo-input').value;

    if (taskText === '') {
        alert('Please enter a task');
        return;
    }

    const todoList = document.getElementById('todo-list');

    // Create list item (li)
    const todoItem = document.createElement('li');
    todoItem.classList.add('todo-item');

    // Create span to hold the task text
    const taskSpan = document.createElement('span');
    taskSpan.innerText = taskText;

    // Create Complete button
    const completeBtn = document.createElement('button');
    completeBtn.innerText = 'Complete';
    completeBtn.addEventListener('click', () => {
        todoItem.classList.toggle('completed');
    });

    // Create Delete button
    const deleteBtn = document.createElement('button');
    deleteBtn.innerText = 'Delete';
    deleteBtn.addEventListener('click', () => {
        todoList.removeChild(todoItem);
    });

    // Append span and buttons to list item
    todoItem.appendChild(taskSpan);
    todoItem.appendChild(completeBtn);
    todoItem.appendChild(deleteBtn);

    // Append list item to the list
    todoList.appendChild(todoItem);

    // Clear input field
    document.getElementById('todo-input').value = '';
}
