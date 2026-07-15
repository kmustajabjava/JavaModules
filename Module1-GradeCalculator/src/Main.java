import model.Student;
import service.GradeCalculator;
import utils.InputValidator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner((System.in));
        GradeCalculator calculator = new GradeCalculator();
        Student student = null;
        while(true){
            System.out.println("\n==============================");
            System.out.println(" Student Grade Calculator");
            System.out.println("==============================");
            System.out.println("1. Register Student");
            System.out.println("2. Exit");

            System.out.print("\nSelect Option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Student Name: ");
                    String name= scanner.nextLine();

                    if (!InputValidator.isValidName(name)){
                        break;
                    }

                    System.out.print("Roll Number: ");
                    String rollNo = scanner.nextLine();

                    if (!InputValidator.isValidRollNo(rollNo)) {

                        System.out.println("Invalid Roll Number.");
                        break;
                    }

                    int[] marks =new int[5];
                    String[] subjects = {
                            "English",
                            "Math",
                            "Programming",
                            "Networking",
                            "Database"};

                    for (int i = 0; i < subjects.length; i++) {

                        while (true) {

                            System.out.print(subjects[i] + ": ");

                            int mark = scanner.nextInt();

                            if (InputValidator.isValidMark(mark)) {

                                marks[i] = mark;
                                break;
                            }

                            System.out.println("Marks must be between 0 and 100.");
                        }
                    }

                    scanner.nextLine();

                    student = new Student(name, rollNo, marks);

                    calculator.calculate(student);

                    System.out.println("\nStudent Registered Successfully.");
                    calculator.displayReport(student);
                    break;

                case 2:

                    System.out.println("\nThank you.");

                    scanner.close();

                    System.exit(0);

                default:

                    System.out.println("\nInvalid Option.");
            }

        }

    }

}