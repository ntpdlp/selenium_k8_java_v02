package lab_14_GUI_Hello.PanelButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI03_PanelButton implements ActionListener {
    private JButton button;
    private JFrame frame;

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Change Color");
        MyPanel myPanel = new MyPanel();

        //hey, button I'm listening to you, I care of what happens to you
        button.addActionListener(this);

        //add button into its GUI
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,myPanel);

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new SimpleGUI03_PanelButton().go();
    }

}
