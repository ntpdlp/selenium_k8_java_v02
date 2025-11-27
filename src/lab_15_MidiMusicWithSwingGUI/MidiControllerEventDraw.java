package lab_15_MidiMusicWithSwingGUI;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class MidiControllerEventDraw extends JPanel implements ControllerEventListener {

    private boolean isEventIWant = false;
    @Override
    public void paintComponent(Graphics g){
        if(isEventIWant){
            int red = new SecureRandom().nextInt(255);
            int green = new SecureRandom().nextInt(255);
            int blue = new SecureRandom().nextInt(255);
            Color rand_color = new Color(red,green,blue);
            int x = new SecureRandom().nextInt(150);
            int y = new SecureRandom().nextInt(150);
            int width = new SecureRandom().nextInt(40);
            int height = new SecureRandom().nextInt(40);
            g.setColor(rand_color);
            g.fillRect(x,y,width,height);
        }
        isEventIWant = false;
    }


    @Override
    public void controlChange(ShortMessage event) {
        isEventIWant = true;
        //this.repaint();

    }
}
