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
        System.out.println("Task:     " + Task);
        System.out.println("Subtask:  " + Subtask);
        System.out.println("Category: " + Category);
        System.out.println("");

    }

}
