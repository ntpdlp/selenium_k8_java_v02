package lab_12_LambdaStream.Example01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SongMapTestDriver02 {
    public static void main(String[] args) {
        List<Song> songList = SongFactory.getSongs();

        //map a song type -> to a genre string type
        List<String> genres = songList.stream()
                .map(Song::getGenre)//::
                .distinct()
                .collect(Collectors.toList());//different way to collect results

        genres.forEach(item -> System.out.println(item));
    }
}
