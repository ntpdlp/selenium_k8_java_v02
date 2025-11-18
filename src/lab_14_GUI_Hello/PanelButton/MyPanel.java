package lab_14_GUI_Hello.HelloJPanel;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class MyPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) { //Graphics is an abstract class
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        /*
        //Ver 01: set a gradient color: Color.BLUE, Color.ORANGE
        Graphics2D graphics2D = (Graphics2D)g;
        GradientPaint gradientPaint = new GradientPaint(70,70,Color.BLUE,150,150, Color.ORANGE);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(50,50,100,100);
        */

        //Ver 02: set a random color
        int red = new SecureRandom().nextInt(255);
        int green = new SecureRandom().nextInt(255);
        int blue = new SecureRandom().nextInt(255);
        Color color01 = new Color(red,green,blue);

        g.setColor(color01);
        g.fillOval(50,50,100,100);
    }
}
