public class TaskItem {

    private String name;
    private String Date;
    private String description;
    private boolean isCompleted = false;

    public TaskItem(String inputName, String inputDate, String inputDescription, boolean completion) {
        this.name = inputName;
        this.Date = inputDate;
        this.description = inputDescription;
        this.isCompleted = completion;

    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void unsetCompleted(){
        this.isCompleted = false;
    }
    public void setCompleted() {
        this.isCompleted = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return Date;
    }

    public String getDescription() {
        return description;
    }

    public String toStringFile() {
        return "[" + Date + "]\n" + name + "\n" + description;
    }

    @Override
    public String toString() {
        return "[" + Date + "] " + name + ": " + description;
    }

}
