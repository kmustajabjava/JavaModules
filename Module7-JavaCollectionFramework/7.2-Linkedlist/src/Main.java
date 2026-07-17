import model.Task;
import service.TaskService;

public class Main {

    public static void main(String[] args) {

        TaskService service =
                new TaskService();

        Task t1 =
                new Task(
                        101,
                        "Apply for Jobs",
                        false
                );

        Task t2 =
                new Task(
                        102,
                        "Practice Java",
                        false
                );

        Task t3 =
                new Task(
                        103,
                        "Complete LinkedList Module",
                        false
                );

        Task urgent =
                new Task(
                        104,
                        "Fix Production Bug",
                        false
                );

        service.addTask(t1);
        service.addTask(t2);
        service.addTask(t3);

        System.out.println("\n===== Current Queue =====\n");

        service.viewTasks();

        System.out.println("\n===== Adding Urgent Task =====\n");

        service.addUrgentTask(urgent);

        service.viewTasks();

        System.out.println("\n===== Next Task =====\n");

        service.nextTask();

        System.out.println("\n===== Completing First Task =====\n");

        service.completeTask();

        System.out.println("\n===== Remaining Tasks =====\n");

        service.viewTasks();

    }

}