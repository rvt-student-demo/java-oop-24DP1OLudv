package rvt.TodoListuzd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class todolist {
    ArrayList<String> tasks;
    private final String filePath = "data/todo.csv";
    
    public todolist() {
        tasks = new ArrayList<>();
        loadFromFile();
    }

    private void loadFromFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            tasks.addAll(lines);
        } catch (IOException e) {
            System.out.println("Could not read file: " + filePath);
        }
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    public void remove(int number) {
        tasks.remove(number - 1);
    }



}
