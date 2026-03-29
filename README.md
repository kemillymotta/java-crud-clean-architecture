# ✅ Java To Do CLI

A simple command-line To Do List application built with Java. Manage your tasks directly from the terminal — add, list, update, delete, and mark tasks as done.

---

## 📋 Features

- Add new tasks
- List all tasks with their status
- Update a task's title
- Delete a task
- Mark a task as done

---

## 🗂️ Project Structure

```
src/
├── application/
│   └── Main.java          # Entry point and menu logic
└── entities/
    ├── Task.java          # Task model
    └── ToDoManager.java   # Business logic
```

---

## ▶️ How to Run

**Requirements:** Java 11+

1. Clone the repository:
   ```bash
   git clone https://github.com/kemillymotta/java-crud-clean-architecture.git
   cd java-crud-clean-architecture
   ```

2. Compile the source files:
   ```bash
   javac -d out src/application/Main.java src/entities/Task.java src/entities/ToDoManager.java
   ```

3. Run the application:
   ```bash
   java -cp out application.Main
   ```

---

## 🖥️ Usage

```
==== TO DO LIST ====
1 - Add task
2 - List tasks
3 - Update task
4 - Delete task
5 - Mark task as done
6 - Exit

Option: 1
Enter task title: Buy groceries
Task added successfully!

Option: 2
[1] [ ] Buy groceries

Option: 5
Enter task id: 1
Task marked as done!

Option: 2
[1] [X] Buy groceries
```

---

## 🛠️ Technologies

- Java (no external dependencies)

