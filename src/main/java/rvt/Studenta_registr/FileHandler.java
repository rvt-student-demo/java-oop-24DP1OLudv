package rvt.Studenta_registr;

import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String FILE = "students.csv";

    public static List<Student> loadStudents() {
        List<Student> list = new ArrayList<>();
        File f = new File(FILE);
        if (!f.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 5) {
                    list.add(new Student(p[0], p[1], p[2], p[3], p[4]));
                }
            }
        } catch (Exception e) {
            System.out.println("Kluda faila lasiisanaa.");
        }
        return list;
    }

    public static void saveStudents(List<Student> students) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Student s : students) {
                pw.println(s.toCSV());
            }
        } catch (Exception e) {
            System.out.println("Kluuda faila rakstiisanaa.");
        }
    }
}


