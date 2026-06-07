package rvt.Studenta_registr;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Registration reg = new Registration();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Studentu Registracijas Sistema ---");
            System.out.println("1. register");
            System.out.println("2. remove");
            System.out.println("3. edit");
            System.out.println("4. view");
            System.out.println("5. exit");
            System.out.print("Choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "register": reg.registerStudent(); break;
                case "remove": reg.removeStudent(); break;
                case "edit": reg.editStudent(); break;
                case "view": reg.viewStudents(); break;
                case "exit": return;
                default: System.out.println("Unknown command.");
            }
        }
    }
}
