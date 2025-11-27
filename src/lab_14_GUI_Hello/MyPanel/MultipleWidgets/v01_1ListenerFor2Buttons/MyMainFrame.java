package lab_14_GUI_Hello.MyPanel.MultipleWidgets.v01_1ListenerFor2Buttons;

import lab_14_GUI_Hello.MyPanel.MultipleWidgets.MyCircle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class MyMainFrame implements ActionListener {
    private JFrame frame;
    private JButton changeCircleBtn;
    private JButton changeLabelBtn;
    private JLabel label;


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==changeCircleBtn){
            frame.repaint();
        }else{
            int rand = new SecureRandom().nextInt();
            label.setText("Label, Label !!".concat("" + rand));
        }
    }


    public void go(){
        frame = new JFrame("4 Widgets");

        //register the same ActionListener to 2 buttons
        changeCircleBtn = new JButton("Change Circle");
        changeLabelBtn = new JButton("Change Label");
        changeCircleBtn.addActionListener(this);
        changeLabelBtn.addActionListener(this);
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
