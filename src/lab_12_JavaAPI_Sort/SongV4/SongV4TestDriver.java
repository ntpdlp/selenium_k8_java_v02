package lab_12_JavaAPI_Sort.SongV4;

import java.util.ArrayList;
import java.util.List;

public class SongV4TestDriver {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("When September ends","Kyler"));
        songs.add(new Song("Hello","ABBA"));
        songs.add(new Song("Hello","ABBA"));
        songs.add(new Song("Winter","Johnson"));
        songs.add(new Song("Winter","Johnson"));

        //based on title: lambda sorted by Comparator
        songs.sort((song1,song2) -> song1.getTitle().compareTo(song2.getTitle())); // A..Z
        System.out.println(songs);

        songs.sort((song1,song2) -> song2.getTitle().compareTo(song1.getTitle())); // reverse Z..A
        System.out.println(songs);
    }
}
