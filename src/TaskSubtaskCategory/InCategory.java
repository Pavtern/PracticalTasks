package TaskSubtaskCategory;

import java.util.Scanner;

public class InCategory {
    public static Category read() {
        Category category = new Category();
        System.out.println("It makes sense.");
        System.out.println("So, in which category we can put this task?");
        Scanner in = new Scanner(System.in);
        String CategoryName = in.nextLine();
        category.setNameOfCategory(CategoryName);
        return category;
    }
}
