package lab_12_JavaAPI_Sort.String;

import lab_12_JavaAPI_Sort.String.MockSongs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MockSongTestDriver {
    public static void main(String[] args) {
        List<String> songs = MockSongs.getSongStrings();
        System.out.println("Print the songs name in alphabet order");
        Collections.sort(songs);
        System.out.println(songs);

        List<String> names = new ArrayList<>(Arrays.asList("Kyler","Mike","Bethy"));
        Collections.sort(names);
        System.out.println(names); //[Bethy, Kyler, Mike]

    }
}
