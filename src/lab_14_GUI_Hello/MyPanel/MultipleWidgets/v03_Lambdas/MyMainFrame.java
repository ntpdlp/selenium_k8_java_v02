package lab_14_GUI_Hello.MyPanel.MultipleWidgets.v03_Lambdas;

import lab_14_GUI_Hello.MyPanel.MultipleWidgets.MyCircle;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class MyMainFrame {
    private JFrame frame;
    private JButton changeCircleBtn;
    private JButton changeLabelBtn;
    private JLabel label;

    public void go(){
        frame = new JFrame("4 Widgets");

        //separately 2 Inner Class for ActionListener to 2 buttons
        changeCircleBtn = new JButton("Change Circle");
        changeLabelBtn = new JButton("Change Label");
        changeCircleBtn.addActionListener(event -> frame.repaint());
        changeLabelBtn.addActionListener(event -> {
            int rand = new SecureRandom().nextInt();
            label.setText("Label " + rand);
        });
        frame.getContentPane().add(BorderLayout.SOUTH,changeCircleBtn);
        frame.getContentPane().add(BorderLayout.EAST,changeLabelBtn);

        //label
        label = new JLabel("I'm a label");
        frame.getContentPane().add(BorderLayout.WEST,label);
        //circle
        MyCircle circle = new MyCircle();
        frame.getContentPane().add(BorderLayout.CENTER,circle);
        //show frame
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyMainFrame().go();
    }
}
