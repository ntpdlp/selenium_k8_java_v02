package lab_14_GUI_Hello.MyPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel02Test implements ActionListener {
    private JFrame frame;

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }

    public void go(){
        frame = new JFrame("Hello Graphics 02");
        Panel02_Widget panel02 = new Panel02_Widget();
        frame.getContentPane().add(panel02);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new Panel02Test().go();
    }
}
