import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) {

        Set<Student> students =
                new HashSet<>();

        Student s1 =
                new Student(
                        101,
                        "Ahmed"
                );

        Student s2 =
                new Student(
                        102,
                        "Ali"
                );

        Student s3 =
                new Student(
                        101,
                        "Ahmed"
                );

        System.out.println(
                students.add(s1)
        );

        System.out.println(
                students.add(s2)
        );

        System.out.println(
                students.add(s3)
        );

        System.out.println();

        System.out.println(
                "Students in HashSet"
        );

        System.out.println();

        for(Student student : students){

            System.out.println(student);

            System.out.println("----------------");

        }

    }

}