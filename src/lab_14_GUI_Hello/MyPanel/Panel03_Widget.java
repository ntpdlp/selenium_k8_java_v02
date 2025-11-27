package lab_14_GUI_Hello.MyPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Panel03_Widget extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        Image image = new ImageIcon("b.png").getImage();

        g.drawImage(image,3,3,this);

    }
}
