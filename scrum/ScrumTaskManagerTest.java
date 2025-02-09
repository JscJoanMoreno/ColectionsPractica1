package scrum;

import java.util.Scanner;

public class ScrumTaskManagerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScrumTaskManager manager = new ScrumTaskManager();

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Move Task to DOING");
            System.out.println("3. Move Task to DONE");
            System.out.println("4. Show Tasks");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter task name:");
                    String name = sc.nextLine();
                    System.out.println("Enter task description:");
                    String description = sc.nextLine();
                    Task task = new Task(name, description);
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.println("Enter task name to move to DOING:");
                    String nameToDoing = sc.nextLine();
                    manager.moveToDoing(new Task(nameToDoing, ""));
                    break;
                case 3:
                    System.out.println("Enter task name to move to DONE:");
                    String nameToDone = sc.nextLine();
                    manager.moveToDone(new Task(nameToDone, ""));
                    break;
                case 4:
                    manager.showTasks();
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
