package lab_14_GUI_Hello.MyPanel;


import javax.swing.*;
import java.awt.*;

public class Panel01_Widget extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(50,50,100,100);
    }
}
