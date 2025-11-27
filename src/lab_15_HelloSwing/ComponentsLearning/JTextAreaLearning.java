package lab_15_HelloSwing.ComponentsLearning;

import javax.swing.*;
import java.awt.*;

public class JTextAreaLearning {
    public static void main(String[] args) {
        new JTextAreaLearning().go();
    }

    public void go(){
        JFrame frame = new JFrame("Hello JTextArea");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me to Add Text");
        JTextArea textArea = new JTextArea(5,20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        //config for each conponents
        frame.getContentPane().setBackground(Color.BLACK);
        panel.setBackground(Color.WHITE);
        panel.add(textArea);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane);

        //arrange GUI
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.SOUTH,button);

        //event
        button.addActionListener(event -> textArea.append("button clicked \n"));

        //show frame
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
