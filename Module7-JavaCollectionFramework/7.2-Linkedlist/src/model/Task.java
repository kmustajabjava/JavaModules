package model;

public class Task {

    private int taskId;
    private String taskName;
    private boolean isCompleted;

    public Task(int taskId, String taskName, boolean isCompleted){
        this.taskId=taskId;
        this.taskName=taskName;
        this.isCompleted=isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {

        return "Task ID   : " + taskId +
                "\nTask Name : " + taskName +
                "\nCompleted : " + isCompleted;

    }
}
