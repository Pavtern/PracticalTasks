package TaskSubtaskCategory;

import java.util.Scanner;

public class InSubtask {


    public static Subtask read() {
        Subtask subtask = new Subtask();
        System.out.println("Does this task have some subtask?");
        System.out.println("Print the name of subtask: ");
        Scanner in = new Scanner(System.in);
        String SubtaskName = in.nextLine();
        subtask.setNameOfSubtask(SubtaskName);
        return subtask;

    }
}