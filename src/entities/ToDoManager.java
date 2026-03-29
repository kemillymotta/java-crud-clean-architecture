package entities;

import java.util.ArrayList;
import java.util.List;

public class ToDoManager {

    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;


    public ToDoManager() {
    }

    public void addTasks(String title) {
        Task task = new Task(nextId, title);
        tasks.add(task);
        nextId++;
        System.out.println("Task added successfully!\n");
    }

    public void listTasks(){
        for(Task task : tasks) {
            System.out.println(task);
            System.out.println();
        }
    }

    public void updateTask(int id, String title) {
        Task task = findById(id);
        if (taskNotFound(task)) return;
        task.setTitle(title);
        System.out.println("Task updated successfully!\n");
    }

    public void deleteTask(int id) {
        Task task = findById(id);
        if (taskNotFound(task)) return;
        tasks.remove(task);
        System.out.println("Task removed successfully.\n");
    }

    public void markAsDone(int id) {
        Task task = findById(id);
        if (taskNotFound(task)) return;
        task.setDone(true);
        System.out.println("Task marked as done!\n");
    }


    private Task findById(int id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private boolean taskNotFound(Task task) {
        if (task == null) {
            System.out.println("Task not found.\n");
            return true;
        }
        return false;
    }
}
