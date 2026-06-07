package rvt.Studenta_registr;

import java.util.*;

public class Registration {
    private List<Student> students;

    public Registration() {
        students = FileHandler.loadStudents();
    }

    public void registerStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        if (!Validator.isValidName(name)) {
            System.out.println("Nepareiz vards.");
            return;
        }

        System.out.print("Surname: ");
        String surname = sc.nextLine();
        if (!Validator.isValidName(surname)) {
            System.out.println("Nepareizs uzvards.");
            return;
        }

        System.out.print("Email: ");
        String email = sc.nextLine();
        if (!Validator.isValidEmail(email) || emailExists(email)) {
            System.out.println("Nepareizi ievadits epasts.");
            return;
        }

        System.out.print("Personal code (XXXXXX-XXXXX): ");
        String code = sc.nextLine();
        if (!Validator.isValidPersonalCode(code) || personalCodeExists(code)) {
            System.out.println("Nepareiz ievadiits personas kods.");
            return;
        }

        System.out.print("Password: ");
        String pass = sc.nextLine();
        if (!Validator.isValidPassword(pass)) {
            System.out.println("Paaraak iisa parole.");
            return;
        }

        students.add(new Student(name, surname, email, code, pass));
        FileHandler.saveStudents(students);
        System.out.println("Students registreets!");
    }

    public void removeStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadi personas kodu: ");
        String code = sc.nextLine();

        boolean removed = students.removeIf(s -> s.getPersonalCode().equals(code));
        FileHandler.saveStudents(students);

        if (removed) System.out.println("Student removed.");
        else System.out.println("Students netika atrasts.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("Students netika saglabaats.");
            return;
        }

        System.out.println("\n--- Saglabaatie studenti ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void editStudent() {
        System.out.println("Neiznaaca redigeet studentu.");
    }

    private boolean emailExists(String email) {
        return students.stream().anyMatch(s -> s.getEmail().equals(email));
    }

    private boolean personalCodeExists(String code) {
        return students.stream().anyMatch(s -> s.getPersonalCode().equals(code));
    }
}

