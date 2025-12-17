package lab_15_HelloSwingPanel.layoutPanel.borderLayout_frame;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {
    public static void main(String[] args) {
        /**
        BorderLayout is the default of JFrame
         BorderLayout is based on regions
         */
        JFrame frame = new JFrame("BorderLayout is the default of JFrame");
        JButton button_north = new JButton("North"); //matching the height but not the width of button
        JButton button_east = new JButton("East"); //matching the width but not the height of button

        //add to frame, the BorderLayout will be the default
        frame.getContentPane().add(BorderLayout.NORTH,button_north);
        frame.getContentPane().add(BorderLayout.EAST,button_east);

        //display
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
