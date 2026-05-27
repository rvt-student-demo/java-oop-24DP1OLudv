package rvt.Trenet.JTabl;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.List;


public class Pamats {
    JFrame frame;
    JTable table;
    JScrollPane scroll;

    public Pamats() throws Exception{
        Path failacels = Paths.get("data/data.csv");
        frame = new JFrame();

        frame.setTitle("Macisanas");

        List<String> viss = Files.readAllLines(failacels);

        String[][] data = new String[viss.size() - 1][2];

        for (int i = 1; i < viss.size(); i++) {
            String[] dalas = viss.get(i).split(",");

            data[i - 1] = dalas;
        }



        String virsraksti = Files.lines(failacels).findFirst().orElse(null);
        String[] columnNames = virsraksti.split(",");

        table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);

        scroll = new JScrollPane(table);
        frame.add(scroll);
        frame.setSize(500, 200);
        frame.setVisible(true);
        }
        public static void main(String[] args) {
                 Exception {
            
            new Pamats();
        }
    }

    



}
