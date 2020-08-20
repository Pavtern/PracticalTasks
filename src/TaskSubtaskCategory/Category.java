package TaskSubtaskCategory;

public class Category {
    private String[] nameOfCategory = {"Work", "Health", "Life"};

    public String getThirdCategory() {
        return nameOfCategory[2];
    }

    public String getName() {
        String a = "";
        /*
        Далее сделал все так сложно для того, чтобы можно было добавлять новые
        категории и использовать каждую категорию по отдельности.
         */
        for (int i = 0; i < nameOfCategory.length; i++) {
            if(i <= nameOfCategory.length-3) {
                a += nameOfCategory[i] + ", ";
            }
            if(i == nameOfCategory.length-2) {
                a += nameOfCategory[i] + " or ";
            }
            if(i == nameOfCategory.length-1) {
                a += nameOfCategory[i] + "?";
            }

        }
        return a;
    }
}
