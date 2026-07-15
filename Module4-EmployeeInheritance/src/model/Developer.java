package model;

public class Developer extends Employee {

    private String programmingLang;

    public Developer(
            int employeeId,
            String name,
            double salary,
            String programmingLang
    ) {

        super(employeeId, name, salary);

        this.programmingLang = programmingLang;

    }

    public String getProgrammingLang() {

        return programmingLang;

    }

    public void setProgrammingLang(String programmingLang) {

        this.programmingLang = programmingLang;

    }

    @Override
    public String toString() {

        return super.toString() +
                "\nProgramming Language : " + programmingLang;

    }

}