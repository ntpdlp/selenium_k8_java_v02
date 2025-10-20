package lab_12_JavaAPI_Sort.SongV2;

import java.util.Comparator;

public class SongArtistComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getArtistName().compareTo(o2.getArtistName());
    }
}
