package rvt.Majina;

import javax.swing.JFrame;

public class MajinaUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("Java grafika");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Majina house = new Majina();
        frame.add(house);
        
        frame.setSize(1000,600);
        frame.setVisible(true);
    }
}
