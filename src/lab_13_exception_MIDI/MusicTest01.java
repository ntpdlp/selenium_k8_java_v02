package lab_13_exception_MIDI;

import javax.sound.midi.*;

public class MusicTest01 {
    public void play(){

        try {
            //1. a sequencer looks like a speaker to play music
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            //2. sequence like a song
            Sequence sequence = new Sequence(Sequence.PPQ,4);

            //3. track
            Track track = sequence.createTrack();

            //4. add a Midi event into track. Midi_Event = song_data
            // The Message says WHAT to do
            // The MidiEvent says WHEN to do it
            int note_to_play = 44;
            ShortMessage msg = new ShortMessage();
            msg.setMessage(ShortMessage.NOTE_ON,1,note_to_play,100);
            track.add(new MidiEvent(msg,1)); //duration to play note = 1

            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(ShortMessage.NOTE_OFF,1,note_to_play,100);
            track.add(new MidiEvent(msg2,5)); //duration of note = 2

            //finally
            player.setSequence(sequence);
            player.start();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new MusicTest01().play();
        System.out.println("end.");
    }
}
