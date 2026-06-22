package ru.alfabank;

public class Task {
    private String nameTask;
    private boolean statusTask;

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public boolean getStatusTask() {
        return statusTask;
    }

    public void setStatusTask() {
        this.statusTask = statusTask;
    }

    @Override
    public String toString() {
        String infoTask;
        if(getStatusTask())
            infoTask = "[x] " + getNameTask();
        else infoTask = "[ ] " + getNameTask();
        return infoTask;
    }
}
