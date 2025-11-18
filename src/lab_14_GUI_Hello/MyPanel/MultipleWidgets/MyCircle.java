package lab_14_GUI_Hello.MyPanel.MultipleWidgets.v01_1ListenerFor2Buttons;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class MyCircle extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = new SecureRandom().nextInt(255);
        int green = new SecureRandom().nextInt(255);
        int blue = new SecureRandom().nextInt(255);
        Color color = new Color(red,green,blue);
        g.setColor(color);
        g.fillOval(50,50,100,100);
    }
}
