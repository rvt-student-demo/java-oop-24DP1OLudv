package rvt;

import java.util.ArrayList;

public class todolist {
    ArrayList<String> tasks;
    public static void main(String[] args) {
        todolist list = new todolist();
        list.add("Bakas");
        list.add("Bakasq");
        list.add("Bakasa");

        list.print();
        list.remove(0);

        System.out.println();
        list.print();
    }

    public todolist() {
        tasks = new ArrayList<>();
    }

    public void add(String task) {
        while (true) {
            tasks.add(task);
        }

    }

    public void print() {
        for (int i = 0; i > tasks.size() - 1; i++) {
            System.out.println(tasks.get(i));
        }
    }

    public void remove(int number) {

    }



}
