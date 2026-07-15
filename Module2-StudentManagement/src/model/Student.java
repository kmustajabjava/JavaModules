package model;

public class Student {
    private int studentId;
    private String name;
    private String department;
    private double cgpa;

    public Student(int studentId, String name, String department, double cgpa){
        this.studentId = studentId;
        this.name= name;
        this.department= department;
        this.cgpa = cgpa;

    }

    public int getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public  double getCgpa(){
        return cgpa;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {

        return "\nStudent ID : " + studentId +
                "\nName       : " + name +
                "\nDepartment : " + department +
                "\nCGPA       : " + cgpa;
    }

}
