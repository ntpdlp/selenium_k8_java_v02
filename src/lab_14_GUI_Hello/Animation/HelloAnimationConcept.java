package lab_14_GUI_Hello.Animation;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

public class HelloAnimationConcept {
    private JFrame frame;
    private int x = 20;
    private int y = 20;
    private static final int STEP = 10;
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;


    public void go(){
        frame = new JFrame("Hello Motivation");
        MoveIt moveIt = new MoveIt();
        //setup frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        //add item on frame
        frame.getContentPane().add(BorderLayout.CENTER,moveIt);
        //finally show frame
        frame.setVisible(true);

        while(x < FRAME_WIDTH){
            moveIt.repaint();
            x += STEP;
            y += STEP;
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    class MoveIt extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            //clear out background
            g.setColor(Color.BLACK);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            //draw image
            g.setColor(Color.ORANGE);
            g.fillOval(x,y,50,50);
        }
    }

    public static void main(String[] args) {
        new HelloAnimationConcept().go();
    }
}
