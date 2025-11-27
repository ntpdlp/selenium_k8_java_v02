package lab_14_GUI_Hello;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloJavaSwing {
    public static void main(String[] args) {
        // step 1: create a new JFrame
        JFrame frame = new JFrame();

        // step 2: create a widget
        JButton button = new JButton("click me");

        // step 3: add widget into jFrame content pane
        frame.getContentPane().add(button);

        // step 4: show it (give it a_size , visible)
        frame.setSize(300,300);
        frame.setVisible(true);

    }

}
