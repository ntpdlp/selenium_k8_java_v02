package lab_13_exception_MIDI;

import javax.sound.midi.*;

/**
 * method play(instrument, note_to_play) will take 2 arguments
 * instrument: instrument to play from 1-127
 * note_to_play: 1 - 127
 */

public class MusicTest02 {
    public void play(int instrument, int note_to_play){

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
            ShortMessage msg = new ShortMessage();
            msg.setMessage(ShortMessage.PROGRAM_CHANGE,1,instrument,0);
            track.add(new MidiEvent(msg,1));

            ShortMessage msg1 = new ShortMessage();
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
        if(args.length < 2){
            System.out.println("Need to input 2 arguments: instrument, note");
        }else{
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            //new MusicTest02().play(102,30);
            //new MusicTest02().play(80,20);
            new MusicTest02().play(40,70);
        }
        System.out.println("end.");
    }
}
