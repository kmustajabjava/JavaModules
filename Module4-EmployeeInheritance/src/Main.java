import model.Developer;
import model.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Developer(
                1,
                "Ali",
                120000,
                "Java"
        );

        System.out.println(employee);
}}