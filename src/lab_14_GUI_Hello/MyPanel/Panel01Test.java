package lab_14_GUI_Hello.MyPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel01Test implements ActionListener {
    private JFrame frame;

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }

    public void go(){
        frame = new JFrame("Hello Graphics");
        Panel01_Widget myDraw = new Panel01_Widget();
        frame.getContentPane().add(BorderLayout.CENTER,myDraw);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Panel01Test().go();
    }
}
