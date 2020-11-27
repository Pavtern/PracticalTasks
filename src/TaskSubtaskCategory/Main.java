package TaskSubtaskCategory;

import TaskSubtaskCategory.db.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello! What we gonna do?");
//        Task task1 = InTask.read();
//        Subtask subtask1 = InSubtask.read();
//        Category category1 = InCategory.read();
//        System.out.println("Great! We created this task:");
//        System.out.println("");
//        System.out.println("Task:     " + task1);
//        System.out.println("Subtask:  " + subtask1);
//        System.out.println("Category: " + category1);
//        System.out.println("");
        String command = "0";
        while (!command.equals("5")){
            System.out.println("Choose the command: ");
            System.out.println("1 - Select");
            System.out.println("2 - Insert");
            System.out.println("3 - Update");
            System.out.println("4 - Delete");
            System.out.println("5 - Exit");

            command = new Scanner(System.in).nextLine();

            switch (command){
                case "1":
                    Select.get();
                    break;
                case "2":
                    Insert.set(readString(1),readString(2),readId(2));
                    break;
                case "3":
                    Update.update(readId(1), readString(1));
                    break;
                case "4":
                    Delete.task(readId(1));
                    break;
                case "5":
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Unknown command: " + command);
            }
        }
    }

    private static long readId(int n) {
        if (n == 1){
        System.out.println("Which ID?");}
        else {
            System.out.println("Which category ID?");}
        String id = new Scanner(System.in).nextLine();
        long parsedId = -1;
        try {
            parsedId = Long.parseLong(id);
        } catch (NumberFormatException e) {
            System.err.println("ID isn't correct");
        }
        return parsedId;
    }
    private static String readString(int n) {
        if (n == 1){
        System.out.println("Insert new name:");}
        else {
            System.out.println("Insert the date (YYYY.MM.DD):");}
        Scanner in = new Scanner(System.in);
        String CategoryName = in.nextLine();
        return CategoryName;
    }
}
