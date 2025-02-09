package scrum;

import java.util.HashSet;
import java.util.Scanner;

public class ScrumTaskManager {
    HashSet<Task> toBeDone = new HashSet<>();
    HashSet<Task> doing = new HashSet<>();
    HashSet<Task> done = new HashSet<>();

    public void addTask(Task task) {
        toBeDone.add(task);
    }

    public void moveToDoing(Task task) {
        if (toBeDone.remove(task)) {
            doing.add(task);
        } else {
            System.out.println("Task not in TO BE DONE state.");
        }
    }

    public void moveToDone(Task task) {
        if (doing.remove(task)) {
            done.add(task);
        } else {
            System.out.println("Task not in DOING state.");
        }
    }

    public void showTasks() {
        System.out.println("TO BE DONE:");
        toBeDone.forEach(task -> System.out.println(task));

        System.out.println("DOING:");
        doing.forEach(task -> System.out.println(task));

        System.out.println("DONE:");
        done.forEach(task -> System.out.println(task));
    }

}

