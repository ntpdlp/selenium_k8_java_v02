package lab_15_MidiMusicWithSwingGUI;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringJoiner;

public class SimpleMidiMusic implements ActionListener {
    private static int VELOCITY = 100;
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;
    private JFrame frame;
    private JPanel westPanel;
    private JPanel eastPanel;
    private JPanel centerPanel;
    private ArrayList<JCheckBox> checkBoxes;
    private MidiControllerEventDraw eventDraw;

    String[] instrumentNames = {"Bass Drum","Closed Hi-Hat","Open Hi-Hat","Acoustic Snare","Crash Cymbal","Hand Clap",
                                "High Tom","Hi Bongo","Maracas","Whistle","Low Conga","Cowbell","Vibraslap",
                                "Low-mid Tom","High Agogo","Open Hi Conga"};
    int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};


    public void setupGUI(){
        frame = new JFrame("Midi Music");
        BorderLayout borderLayout = new BorderLayout();
        JPanel background = new JPanel(borderLayout);
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        eventDraw = new MidiControllerEventDraw();//panel for sounds
        GridLayout gridLayout = new GridLayout(16,16);// 16 x 16 checkboxes in center
        GridLayout labelsLayout = new GridLayout(16,1);
        checkBoxes = new ArrayList<>();
        eastPanel = new JPanel();
        westPanel = new JPanel(labelsLayout);
        centerPanel = new JPanel(gridLayout);
        //east buttons
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        JButton btnTempoUp = new JButton("Tempo Up");
        JButton btnTempoDown = new JButton("Tempo Down");

        //frame setup
        frame.setVisible(true);
        frame.setSize(MidiConstants.FRAME_WIDTH,MidiConstants.FRAME_HEIGHT);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().add(BorderLayout.CENTER,eventDraw);//for sound
        frame.getContentPane().add(background);
        background.add(BorderLayout.EAST,eastPanel);
        background.add(BorderLayout.WEST,westPanel);
        background.add(BorderLayout.CENTER,centerPanel);

        //west panel
       // westPanel.setLayout(new BoxLayout(westPanel,BoxLayout.Y_AXIS));
        labelsLayout.setHgap(2);
        for(int i = 0; i<instrumentNames.length; i++){
            JLabel label = new JLabel(instrumentNames[i]);
            label.setBorder(BorderFactory.createEmptyBorder(4,1,4,1));
            westPanel.add(label);
        }

        //center will be 16 checkboxes
        gridLayout.setVgap(1);
        gridLayout.setHgap(2);
        for(int i = 0; i<256; i++){
            JCheckBox checkBox = new JCheckBox();
            checkBox.setSelected(false);
            checkBoxes.add(checkBox);
            centerPanel.add(checkBox);
        }


        //east panel
        eastPanel.setLayout(new BoxLayout(eastPanel,BoxLayout.Y_AXIS));
        eastPanel.add(btnStart);
        eastPanel.add(btnStop);
        eastPanel.add(btnTempoUp);
        eastPanel.add(btnTempoDown);
        btnStart.addActionListener(e -> midiStart());
        btnStop.addActionListener( e -> sequencer.stop());
        btnTempoUp.addActionListener(e -> changeTempo(1.3f));
        btnTempoDown.addActionListener(e -> changeTempo(0.97f));

    }


    private void changeTempo(float tempoAdjust) {
        float currentTempo = sequencer.getTempoFactor();
        sequencer.setTempoFactor( currentTempo * tempoAdjust);
    }

    private void midiStart() {
        //get checkboxes value
        int[] trackList;

        //clear-up
        sequence.deleteTrack(track);
        track = sequence.createTrack();

        //for 16 instrument name: Bass , .. , Conga
        for(int i = 0; i < 16; i++){
            //each instrument has 16 beat options
            trackList = new int[16];
            //get current instrument key
            int instrucment_key = instruments[i];
            for(int j = 0; j<16; j++){
                JCheckBox jc = checkBoxes.get(j + 16*i);
                if(jc.isSelected()){
                    trackList[j] = instrucment_key;
                }else{
                    trackList[j] = 0; //no selected
                }
            }//end for each instrument
            makeTracksForInstrument(trackList);
            track.add(makeEvent(ShortMessage.CONTROL_CHANGE,1,127,0,16)); //16 beats
        }//end_for_each_instrument
        track.add(makeEvent(ShortMessage.PROGRAM_CHANGE,9,1,0,15));//


        int first_controller = 127;
        try {
            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
    }

    private void makeTracksForInstrument(int[] trackList) {
        for(int i =0; i<16; i++){
            int key = trackList[i];
            if(key != 0){
                track.add(makeEvent(ShortMessage.NOTE_ON,9,key,100,i));
                track.add(makeEvent(ShortMessage.NOTE_OFF,9,key,100,i+1));
            }
        }
    }

    public void setupSequencer(){
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            //need to implement a ControllerEventListener
            //int[] eventIWants = {127};
            //draw
            //sequencer.addControllerEventListener(eventDraw,eventIWants);
            //setup for Sequencer
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(220);
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
    }

    public void go(){
        setupGUI();
        setupSequencer();
    }


    public static void main(String[] args) {
        new SimpleMidiMusic().go();

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
