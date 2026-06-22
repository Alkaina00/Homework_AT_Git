package ru.alfabank;

public class Main {
    public static void main(String[] args) {
        TaskTracker taskTracker = new TaskTracker();

        System.out.println("Добавление задач: ");
        taskTracker.addNewTask(new Task("Задача1", true));
        taskTracker.addNewTask(new Task("Задача2", false));
        taskTracker.addNewTask(new Task("Задача3", true));
        taskTracker.addNewTask(new Task("Задача4", false));
        taskTracker.addNewTask(new Task("Задача5", true));
        System.out.println();

        taskTracker.printAllTask();

        System.out.println("Поиск задачи по имени: ");
        taskTracker.searchTaskName("Задача1");
        System.out.println();

        taskTracker.doneTask("Задача2");
        System.out.println();

        taskTracker.printAllTask();

        System.out.println(taskTracker);
    }
}