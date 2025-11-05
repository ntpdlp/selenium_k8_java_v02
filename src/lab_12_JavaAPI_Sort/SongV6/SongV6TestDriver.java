package lab_12_JavaAPI_Sort.SongV6;

import lab_12_JavaAPI_Sort.SongV6.Song;

import java.util.*;

public class SongV6TestDriver {
    public static void main(String[] args) {
        List<Song> songList = new ArrayList<>();
        songList.add(new Song("When September ends","Kyler"));
        songList.add(new Song("Hello","ABBA"));
        songList.add(new Song("Hello","ABBA"));
        songList.add(new Song("Winter","Johnson"));
        songList.add(new Song("Winter","Johnson"));

        Set<Song> songSet = new TreeSet<>(songList);
        System.out.println("as set no duplication and with default title order: \n" + songSet);

        //using lambda in TreeSet<> to sort your new comparator
        Set<Song> songSet2 = new TreeSet<>(new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                return o1.getArtistName().compareTo(o2.getArtistName());
            }
        });
        songSet2.addAll(songList);
        System.out.println("set with new lambda artistName comparator: \n" + songSet2);
    }
}
