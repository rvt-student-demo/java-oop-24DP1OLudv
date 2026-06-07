package rvt.Studenta_registr;

public class Validator {

    public static boolean isValidName(String name) {
        return name.matches("[A-Za-z]{3,}");
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$");
    }

    public static boolean isValidPersonalCode(String code) {
        return code.matches("\\d{6}-\\d{5}");
    }

    public static boolean isValidPassword(String pass) {
        return pass.length() >= 6;
    }
}
