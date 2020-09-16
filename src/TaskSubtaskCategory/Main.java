package TaskSubtaskCategory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! What we gonna do?");
        Task task1 = InTask.read();
        Subtask subtask1 = InSubtask.read();
        Category category1 = InCategory.read();
        System.out.println("Great! We created this task:");
        System.out.println("");
        System.out.println("Task:     " + task1);
        System.out.println("Subtask:  " + subtask1);
        System.out.println("Category: " + category1);
        System.out.println("");

    }

}
