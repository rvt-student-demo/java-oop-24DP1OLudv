package rvt.Majina;

import java.awt.Graphics; 
import javax.swing.JPanel;

public class Majina extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(400, 200, 200, 200);
        g.drawLine(400, 200, 500, 100);
        g.drawLine(600, 200, 500, 100);

        g.drawRect(450, 300, 50, 100);
        g.drawLine(485, 350, 500, 350);

        g.drawRect(520, 300, 50, 50);
        g.drawLine(545, 300, 545, 350);
        g.drawLine(520, 325, 570, 325);

        g.drawOval(475, 220, 50, 50);
        g.drawLine(500, 220, 500, 270);
        g.drawLine(475, 245, 525, 245);
        
        g.drawOval(482, 140, 36, 36);
    }
}

