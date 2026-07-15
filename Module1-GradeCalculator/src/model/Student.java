package model;

public class Student {
    private String name;
    private String rollNo;
    private int[] marks;

    private int total;
    private double percentage;
    private String grade;
    private String result;

    public Student(String name, String rollNo, int[] marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public String getName(){
        return name;
    }

    public String getRollNo(){
        return rollNo;
    }

    public int[] getMarks(){
        return marks;
    }

    public int getTotal(){
        return total;
    }

    public String getGrade() {
        return grade;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getResult() {
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
