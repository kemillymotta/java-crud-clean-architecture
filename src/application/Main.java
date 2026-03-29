package application;

import entities.ToDoManager;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ToDoManager manager = new ToDoManager();

        int option = 0;
        while (option != 6) {
            System.out.println("==== TO DO LIST ====");
            System.out.println("1 - Add task");
            System.out.println("2 - List tasks");
            System.out.println("3 - Update task");
            System.out.println("4 - Delete task");
            System.out.println("5 - Mark task as done");
            System.out.println("6 - Exit\n");
            System.out.print("\nOption: ");
            option = sc.nextInt();

            String title;
            int id;
            switch (option) {
                case 1:
                    System.out.print("Enter task title: ");
                    sc.nextLine();
                    title = sc.nextLine();
                    manager.addTasks(title);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Enter task id: ");
                    id = sc.nextInt();
                    System.out.print("Enter new task title: ");
                    sc.nextLine();
                    title = sc.nextLine();
                    manager.updateTask(id, title);
                    break;
                case 4:
                    System.out.print("Enter task id: ");
                    id = sc.nextInt();
                    manager.deleteTask(id);
                    break;
                case 5:
                    System.out.print("Enter task id: ");
                    id = sc.nextInt();
                    manager.markAsDone(id);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }


        sc.close();
    }

}




