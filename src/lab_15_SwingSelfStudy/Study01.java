package lab_15_SwingSelfStudy;

import javax.swing.*;
import java.io.*;

public class Study01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setTitle("Frame title goes here!");

        //ImageIcon
        ImageIcon icon = new ImageIcon("./src/lab_15_SwingSelfStudy/girlLogo.jpeg");
        frame.setIconImage(icon.getImage());



    }
}
