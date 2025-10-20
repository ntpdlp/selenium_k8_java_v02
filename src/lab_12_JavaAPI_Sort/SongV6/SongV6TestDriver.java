package lab_12_JavaAPI_Sort.SongV6;

import lab_12_JavaAPI_Sort.SongV6.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SongV6TestDriver {
    public static void main(String[] args) {
        List<Song> songList = new ArrayList<>();
        songList.add(new Song("When September ends","Kyler"));
        songList.add(new Song("Hello","ABBA"));
        songList.add(new Song("Hello","ABBA"));
        songList.add(new Song("Winter","Johnson"));
        songList.add(new Song("Winter","Johnson"));

        //based on title
        songList.sort((song1,song2) -> song1.getTitle().compareTo(song2.getTitle())); // A..Z
        System.out.println("as list: \n" + songList);

        Set<Song> songSet = new TreeSet<>(songList);
        System.out.println("as set with order: \n" + songSet);
    }
}
