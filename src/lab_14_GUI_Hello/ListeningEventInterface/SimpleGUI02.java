package lab_14_GUI_Hello.ListeningEventInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI02 implements ActionListener{

    private JButton button;

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Hey, I was clicked!");
        System.out.println(e.getActionCommand()); //return name of button 'Click Me'
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click Me");
        frame.getContentPane().add(button);
        //talk to button, hey! add me to your list of ActionListener nhe
        button.addActionListener(this);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
