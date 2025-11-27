package lab_14_GUI_Hello.MyPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel03Test implements ActionListener {
    private JFrame frame;

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }

    public void go(){
        frame = new JFrame("Hello Graphics 03");
        Panel03_Widget mydraw = new Panel03_Widget();
        frame.add(mydraw);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Panel03Test().go();
    }
}
