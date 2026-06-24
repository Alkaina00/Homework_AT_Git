package ru.alfabank;

public class Task {
    private String nameTask;
    private boolean statusTask;

    public Task(String nameTask, boolean statusTask){
        this.nameTask = nameTask;
        this.statusTask = statusTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public boolean getStatusTask() {
        return statusTask;
    }

    public void setStatusTask(boolean statusTask) {
        this.statusTask = statusTask;
    }

    @Override
    public String toString() {
        if(getStatusTask())
            return "[x] " + getNameTask();
        else return "[ ] " + getNameTask();
    }
}
