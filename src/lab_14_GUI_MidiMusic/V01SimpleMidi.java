package lab_14_GUI_MidiMusic;

import javax.sound.midi.*;

public class V01SimpleMidi {
    public static void main(String[] args) {
        try {
            // [Sequencer]
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // [Sequence]
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();
            for(int i = 5; i<61; i++){
            track.add(makeEvent(ShortMessage.NOTE_ON,1,i,100,i));
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
}
