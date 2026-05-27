package rvt.Jtable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Jtable {
    private final String filePath = "data/data.csv";
    // frame
    JFrame f;
    // Table
    JTable j;
    ArrayList<String> tasks;

    // Constructor
    Jtable()
    {
        // Frame initialization
        f = new JFrame();
        tasks = new ArrayList<>();
        loadFromFile();

        // Frame Title
        f.setTitle("JTable Example");
    }

    private void loadFromFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            
            tasks.addAll(lines);

            String[] columnNames = lines.get(0).split(",");

            String[][] data = new String[lines.size() - 1][];

            for (int i = 1; i < lines.size(); i++) {
                data[i - 1] = lines.get(i).split(",");
            }

            j = new JTable(data, columnNames);

            JScrollPane sp = new JScrollPane(j);

            f.add(sp);

        } catch (IOException e) {
            System.out.println("Could not read file: " + filePath);
        }

        // Data to be displayed in the JTable
        String[][] data = {
            { "Kundan Kumar Jha", "4031", "CSE" },
            { "Anand Jha", "6014", "IT" }
        };

        // Column Names
        String[] columnNames = { "Name", "Roll Number", "Department" };

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }

    // Driver  method
    public static void main(String[] args)
    {
        new Jtable();
    }
}