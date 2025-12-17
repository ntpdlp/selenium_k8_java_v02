package lab_15_HelloSwingPanel.layoutPanel.flowLayout_panel;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest {
    public static void main(String[] args) {
        /**
         FlowLayout is the default of JPanel
         Left to Right
         */
        JFrame frame = new JFrame("FlowLayout is the default of JPanel");
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        JButton button_north = new JButton("North");
        JButton button_east = new JButton("East");
        JButton button_shock = new JButton("Shock Side By Side");

        //add buttons to JPanel: will follow JPanel_FlowLayout policies
        panel.add(button_north);
        panel.add(button_east);
        panel.add(button_shock);

        //add panel to frame: will follow JFrame_BorderLayout policies
        frame.getContentPane().add(BorderLayout.EAST,panel);

        //display
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
