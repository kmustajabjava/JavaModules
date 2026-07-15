package utils;

public class InputValidator {

    public static boolean isValidTitle(String title) {

        return title != null && !title.trim().isEmpty();

    }

    public static boolean isValidAuthor(String author) {

        return author != null && !author.trim().isEmpty();

    }

    public static boolean isValidCategory(String category) {

        return category != null && !category.trim().isEmpty();

    }

}