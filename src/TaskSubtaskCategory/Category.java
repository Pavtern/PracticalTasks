package TaskSubtaskCategory;

public class Category {
    private String[] nameOfCategory = {"Work", "Health", "Life"};

    public String getThirdCategory() {
        return nameOfCategory[2];
    }

    public String getName() {
        String listOfCategory = "";
        /*
        Далее сделал все так сложно для того, чтобы можно было добавлять новые
        категории и использовать каждую категорию по отдельности.
         */
        for (int i = 0; i < nameOfCategory.length; i++) {
            if(i <= nameOfCategory.length-3) {
                listOfCategory += nameOfCategory[i] + ", ";
            }
            if(i == nameOfCategory.length-2) {
                listOfCategory += nameOfCategory[i] + " or ";
            }
            if(i == nameOfCategory.length-1) {
                listOfCategory += nameOfCategory[i] + "?";
            }

        }
        return listOfCategory;
    }
}
