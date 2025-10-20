package lab_12_JavaAPI_Sort.SongV2;

import lab_12_JavaAPI_Sort.SongV2.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongV2TestDriver {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("When September ends","Kyler"));
        songs.add(new Song("Hello","ABBA"));
        songs.add(new Song("Winter","Johnson"));

        Collections.sort(songs,new SongArtistComparator());
        System.out.println(songs);

        Collections.sort(songs,new SongTitleComparator());
        System.out.println(songs);
    }
}
