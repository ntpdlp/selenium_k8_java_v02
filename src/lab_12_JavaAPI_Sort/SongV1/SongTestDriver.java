package lab_12_JavaAPI_Sort.SongV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongTestDriver {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("When September ends","Kyler"));
        songs.add(new Song("Hello","ABBA"));
        songs.add(new Song("Winter","Johnson"));
        System.out.println("as entered: \n" + songs);

        Collections.sort(songs);
        System.out.println("by name: \n" + songs);
    }
}
