package TaskSubtaskCategory;

import java.util.Scanner;

public class InTask {


    public static Task read() {
        Task task = new Task();
        System.out.println("My task is: ");
        Scanner in = new Scanner(System.in);
        String TaskName = in.nextLine();
        System.out.println("That's great!");
        task.setNameOfTask(TaskName);
        return task;

    }
}
