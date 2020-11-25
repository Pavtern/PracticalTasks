package TaskSubtaskCategory;

public class Task {
    private String nameOfTask;

    public void setNameOfTask(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public String getNameOfTask() {
        return nameOfTask;
    }
    @Override
    public String toString() {
        return nameOfTask + ".";
    }

}
