package lab_12_JavaAPI_Sort.SongV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SongV3TestDriver {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("When September ends","Kyler"));
        songs.add(new Song("Hello","ABBA"));
        songs.add(new Song("Winter","Johnson"));

        //based on title
        Collections.sort(songs, new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println(songs);

        //based on artistName
        Collections.sort(songs, new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                return o1.getArtistName().compareTo(o2.getArtistName());
            }
        });
    }
}
