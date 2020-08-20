package TaskSubtaskCategory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! What we gonna do?");
        System.out.println("My task is: ");
        String Task = in.nextLine();
        System.out.println("That's great!");
        System.out.println("Does this task have some subtask?");
        System.out.println("Print the name of subtask: ");
        String Subtask = in.nextLine();
        System.out.println("It makes sense.");
        System.out.println("So, in which category we can put this task?");
        Category category = new Category();
        System.out.println(category.getName());
        String Category = in.nextLine();
        System.out.println("Great! We create this task:");
        System.out.println("Task: " + Task);
        System.out.println("Subtusk: " + Subtask);
        System.out.println("Category: " + Category);
        System.out.println("We also have another task for tomorrow:");
        Task task = new Task();
        System.out.println("Task: " + task.getNameOfTask());
        Subtask subtask = new Subtask();
        System.out.println("Subtusk: " + subtask.getNameOfSubstring());
        System.out.println("Category: " + category.getThirdCategory());

    }

}
