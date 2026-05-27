package rvt.PD_Test;
import java.util.ArrayList;

public class School {
    ArrayList<Student> studenti = new ArrayList<>();

    public void addStudent(Student students) {
        studenti.add(students);
    }
    public void removeStudent(Student students) {
        studenti.remove(students);
    }
    public void printAll() {
        for(Student student : studenti) {
            student.studentPrint();
        }
    }
}
