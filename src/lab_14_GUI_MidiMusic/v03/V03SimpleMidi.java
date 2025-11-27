package lab_14_GUI_MidiMusic.v03;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V03SimpleMidi implements ActionListener {
    private JFrame frame;
    private MyDraw myDraw;

    public void setupGUI(){
        frame = new JFrame("Simple Midi Music");
        myDraw = new MyDraw();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.getContentPane().add(BorderLayout.CENTER,myDraw);
    }

    public void go(){
        setupGUI();

        try {
            // [Sequencer]
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            //add EventListener
            int[] eventIWants = {127};
            sequencer.addControllerEventListener(myDraw,eventIWants);

            // [Sequence]
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();
            for(int i = 5; i<61; i++){
                track.add(makeEvent(ShortMessage.NOTE_ON,1,i,100,i));

                //add control_change to node127
                track.add(makeEvent(ShortMessage.CONTROL_CHANGE,1,127,0,i));

                track.add(makeEvent(ShortMessage.NOTE_OFF,1,i,100,i+2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (MidiUnavailableException e) {
            throw new RuntimeException(e);
        } catch (InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }

    }



    public static void main(String[] args) {
        new V03SimpleMidi().go();
    }

    public static MidiEvent makeEvent(int command, int channel, int one, int two, int tick) {
        MidiEvent midiEvent = null;
        ShortMessage shortMessage = new ShortMessage();
        try {
            shortMessage.setMessage(command, channel, one, two);
            midiEvent = new MidiEvent(shortMessage,tick);
        } catch (InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
            return midiEvent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
