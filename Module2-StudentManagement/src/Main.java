import java.util.Scanner;

import model.Student;
import service.StudentService;
import utils.InputValidator;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n==============================");
            System.out.println(" Student Management System");
            System.out.println("==============================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("==============================");

            System.out.print("Select Option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Department: ");
                    String department = input.nextLine();

                    System.out.print("CGPA: ");
                    double cgpa = input.nextDouble();
                    input.nextLine();
                    if (!InputValidator.isValidName(name)) {

                        System.out.println("Invalid name.");
                        break;

                    }

                    if (!InputValidator.isValidDepartment(department)) {

                        System.out.println("Invalid department.");
                        break;

                    }

                    if (!InputValidator.isValidCgpa(cgpa)) {

                        System.out.println("CGPA must be between 0 and 4.");
                        break;

                    }

                    Student student = new Student(id, name, department, cgpa);

                    service.addStudent(student);

                    break;

                case 2:

                    service.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    id = input.nextInt();
                    input.nextLine();

                    Student found = service.searchStudent(id);

                    if (found != null) {

                        System.out.println(found);

                    } else {

                        System.out.println("Student not found.");

                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    id = input.nextInt();
                    input.nextLine();

                    System.out.print("New Name: ");
                    name = input.nextLine();

                    System.out.print("New Department: ");
                    department = input.nextLine();

                    System.out.print("New CGPA: ");
                    cgpa = input.nextDouble();
                    input.nextLine();
                    if (!InputValidator.isValidName(name)) {

                        System.out.println("Invalid name.");
                        break;

                    }

                    if (!InputValidator.isValidDepartment(department)) {

                        System.out.println("Invalid department.");
                        break;

                    }

                    if (!InputValidator.isValidCgpa(cgpa)) {

                        System.out.println("CGPA must be between 0 and 4.");
                        break;

                    }
                    boolean updated = service.updateStudent(
                            id,
                            name,
                            department,
                            cgpa
                    );

                    if (updated) {

                        System.out.println("Student updated successfully.");

                    } else {

                        System.out.println("Student not found.");

                    }

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");
                    id = input.nextInt();
                    input.nextLine();

                    boolean deleted = service.deleteStudent(id);

                    if (deleted) {

                        System.out.println("Student deleted successfully.");

                    } else {

                        System.out.println("Student not found.");

                    }

                    break;

                case 6:

                    System.out.println("Thank you!");

                    input.close();

                    return;

                default:

                    System.out.println("Invalid option.");

            }

        }

    }

}