package ru.alfabank;

import java.util.ArrayList;

public class TaskTracker {
    private ArrayList<Task> listTask;

    public TaskTracker(){
        this.listTask = new ArrayList<>();
    }

    public void addNewTask(Task task) {
        listTask.add(task);
        System.out.println("Добавление задачи: " + task.getNameTask());
    }

    public void printAllTask() {
        System.out.println("Вывод всех задач: ");
        for(Task task: listTask) {
            System.out.println(task);
        }
        System.out.println();
    }

    public int searchIndexTaskName(String nameTask) {
        int indexTask = -1;
        for(Task task: listTask) {
            if(task.getNameTask().equals(nameTask))
                indexTask = listTask.indexOf(task);
        }
        return indexTask;
    }

    public void searchTaskName(String nameTask) {
        int index = searchIndexTaskName(nameTask);
        if(index == -1)
            System.out.println("Задача не найдена");
        else System.out.println(listTask.get(index));
    }

    public void doneTask(String nameTask)  {
        int index = searchIndexTaskName(nameTask);

        if(index == -1)
            System.out.println("Задача не найдена");
        else {
            listTask.get(index).setStatusTask(true);
            System.out.println("Отметить задачу \"" + nameTask + "\" как выполненную: ");
            searchTaskName(nameTask);
        }

    }

    @Override
    public String toString() {
        int countDoneTask = 0;
        int countOpenTask = 0;

        for(Task task: listTask) {
            if(task.getStatusTask())
                countDoneTask++;
            else countOpenTask++;
        }

        System.out.println("Вывод статистики по задачам: ");
        return "Всего задач: " + listTask.size() + "\n" +
                "Выполнено: " + countDoneTask + "\n" +
                "Открыто: " + countOpenTask;
    }
}
