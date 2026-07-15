package utils;

public class InputValidator {

    public static boolean isValidCgpa(double cgpa) {

        return cgpa >= 0.0 && cgpa <= 4.0;

    }

    public static boolean isValidName(String name) {

        return name != null && !name.trim().isEmpty();

    }

    public static boolean isValidDepartment(String department) {

        return department != null && !department.trim().isEmpty();

    }

}