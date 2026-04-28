package rvt.Studenta_registr;

public class Validator {
    
    public static boolean isValidName(String name) {
        return name.matches("[A-Za-zĀ-ž]{3,}");
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
}
