package lab_14_GUI_Hello.MyPanel;

import javax.swing.*;
import java.awt.*;

public class Panel02_Widget extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        //add: fill background in black color
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        g.setColor(Color.ORANGE);
        g.fillOval(50,50,100,100);
    }
}
