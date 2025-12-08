package lab_15_SwingSelfStudy.v01;

import javax.swing.*;

public class Study01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setTitle("Frame title goes here!");

        //ImageIcon
        ImageIcon icon = new ImageIcon("../girlLogo.jpeg");
        frame.setIconImage(icon.getImage());
    }
}
