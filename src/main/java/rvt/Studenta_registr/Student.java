package rvt.Studenta_registr;

public class Student {
    private String name;
    private String surname;
    private String email;
    private String personalCode;
    private String password;

    public Student(String name, String surname, String email, String personalCode, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.personalCode = personalCode;
        this.password = password;
    }

    public String toCSV() {
        return name + "," + surname + "," + email + "," + personalCode + "," + password;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + " " + surname + " | " + email + " | " + personalCode;
    }
}
