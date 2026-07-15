package service;
import model.Student;

public class GradeCalculator {
    public void calculate(Student student){
        int total =0;
        for (int mark: student.getMarks()){
         total = total+ mark;
        }

        double percentage = total/5.0;
        String grade;
        if(percentage>=90){
            grade = "A+";
        }
        else if (percentage>=80) {
            grade = "A";
        }
        else if (percentage >= 70) {
            grade = "B";
        }
        else if (percentage >= 60) {
            grade = "C";
        }
        else if (percentage >= 50) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        String result = percentage>=50?"PASS":"FAIL";
        student.setTotal(total);
        student.setPercentage(percentage);
        student.setGrade(grade);
        student.setResult(result);
    }

    public void displayReport(Student student){
        System.out.println("\n================STUDENT REPORT====================");
        System.out.println("Name: "+ student.getName());
        System.out.println("Name       : " + student.getName());
        System.out.println("Roll No    : " + student.getRollNo());
        System.out.println("Total      : " + student.getTotal());
        System.out.printf("Percentage : %.2f%%\n", student.getPercentage());
        System.out.println("Grade      : " + student.getGrade());
        System.out.println("Result     : " + student.getResult());
        System.out.println("\n====================================");
    }
}
