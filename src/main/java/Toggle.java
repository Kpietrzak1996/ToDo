public class Toggle {
    private String Task;
    private boolean DoneTask;

    public Toggle(String Task) {
        this.Task = Task;
        this.DoneTask = false;
    }

    public void setDone() {
        DoneTask = true;
    }

    public void taskPrint() {
        System.out.printf(Task + " - ");
        if (DoneTask) {
            System.out.println("Task DONE");
        }else {
            System.out.println("Need TO DO");
        }
    }

    public String getTask(){return Task;}


}
