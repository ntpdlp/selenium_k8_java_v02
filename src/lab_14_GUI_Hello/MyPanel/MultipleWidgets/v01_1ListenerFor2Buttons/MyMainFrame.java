package lab_14_GUI_Hello.MyPanel.MultipleWidgets.v01_notOOP;

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

        changeCircleBtn = new JButton("Change Circle");
        changeLabelBtn = new JButton("Change Label");
        frame.getContentPane().add(BorderLayout.SOUTH,changeCircleBtn);
        changeCircleBtn.addActionListener(this);

        changeLabelBtn.setName("changeLabelBtn");
        frame.getContentPane().add(BorderLayout.EAST,changeLabelBtn);
        changeLabelBtn.addActionListener(this);

        label = new JLabel("I'm a label");
        frame.getContentPane().add(BorderLayout.WEST,label);

        MyCircle circle = new MyCircle();
        frame.getContentPane().add(BorderLayout.CENTER,circle);

        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyMainFrame().go();
    }
}
