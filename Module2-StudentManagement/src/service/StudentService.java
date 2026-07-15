package service;
import model.Student;

import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students; //dynamic list that is gonna store student objs, not storing primitive values here

    public StudentService(){
        students= new ArrayList<>(); // creates an empty list
    }

    public void addStudent(Student student) {

        if (searchStudent(student.getStudentId()) != null) {

            System.out.println("\nStudent ID already exists.");

            return;

        }

        students.add(student);

        System.out.println("\nStudent added");

    }

    public void viewStudents(){
        if (students.isEmpty()){
            System.out.println("No Students to show");
            return;
        }
        else{
            for(Student student: students){
                System.out.println(student);
                System.out.println("***********************");
            }
        }
    }

    public Student searchStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public boolean updateStudent(int studentId, String newName, String newDepartment, double newCgpa){
        Student student = searchStudent(studentId);
        if(student==null){
            return false;
        }

        student.setName(newName);
        student.setDepartment(newDepartment);
        student.setCgpa(newCgpa);
        return true;
    }

    public boolean deleteStudent(int studentId){
        Student student= searchStudent(studentId);
        if(student==null){
            return false;
        }
        students.remove(student);
        return true;
    }

}
