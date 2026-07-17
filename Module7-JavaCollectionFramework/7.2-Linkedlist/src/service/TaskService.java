package service;

import model.Task;

import java.util.LinkedList;
import java.util.List;

public class TaskService {
    private List<Task> tasks=new LinkedList<>();

    public void addTask(Task task) {

        tasks.addLast(task);

        System.out.println("Task added.");

    }

    public void addUrgentTask(Task task) {

        tasks.addFirst(task);

        System.out.println("Urgent task added.");

    }

    public void viewTasks() {

        if(tasks.isEmpty()){

            System.out.println("No Tasks.");

            return;

        }

        for(Task task : tasks){

            System.out.println(task);

            System.out.println("----------------");

        }

    }

    public void nextTask() {

        if(tasks.isEmpty()){

            System.out.println("No tasks.");

            return;

        }

        System.out.println(tasks.getFirst());

    }

    public void completeTask() {

        if(tasks.isEmpty()){

            System.out.println("No tasks.");

            return;

        }

        Task completed =
                tasks.removeFirst();

        completed.setCompleted(true);

        System.out.println("Completed:");

        System.out.println(completed);

    }
}
