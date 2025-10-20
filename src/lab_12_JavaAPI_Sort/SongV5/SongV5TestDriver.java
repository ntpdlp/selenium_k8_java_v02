package lab_12_JavaAPI_Sort.SongV5;


import java.util.*;

public class SongV5TestDriver {
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

        //List can have duplicate values, but Set no duplication
        Set<Song> songsSet = new HashSet<>(songList);
        System.out.println("as set: \n" + songsSet);
    }
}
