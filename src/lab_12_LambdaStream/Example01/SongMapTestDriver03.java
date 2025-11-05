package lab_12_LambdaStream.Example01;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SongMapTestDriver03 {
    public static void main(String[] args) {
        List<Song> songList = SongFactory.getSongs();

        //collecting results in different ways
        //Collectors.toList()
        //Collectors.toSet()
        //Collectors.toMap()
        //Collectors.joining => will return a string, suitable for CVS creating with optional sperator
        Set<String> genres = songList.stream()
                .map(song -> song.getGenre())//::
                .collect(Collectors.toSet());

        genres.forEach(item -> System.out.println(item));
    }
}
