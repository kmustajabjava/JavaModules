package utils;

public class InputValidator {
    public static boolean isValidName(String name){
        return name != null &&!name.trim().isEmpty();
    }

    public static boolean isValidRollNo(String rollNo){
        return rollNo !=null && !rollNo.trim().isEmpty();
    }

    public static boolean isValidMark( int mark){
        return mark>=0 && mark<=100;
    }
}
