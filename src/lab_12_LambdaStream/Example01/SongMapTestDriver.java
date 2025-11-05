package lab_12_LambdaStream.Example01;

import java.util.List;
import java.util.stream.Collectors;

public class SongMapTestDriver {
    public static void main(String[] args) {
        List<Song> songList = SongFactory.getSongs();

        //map a song type -> to a genre string type
        List<String> genres = songList.stream()
                .map(song -> song.getGenre())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        genres.forEach(item -> System.out.println(item));
    }
}
