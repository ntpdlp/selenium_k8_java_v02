package lab_12_LambdaStream.Example01;

import java.util.List;
import java.util.stream.Collectors;

public class SongFilterTestDriver {
    public static void main(String[] args) {
        List<Song> songList = SongFactory.getSongs();

        List<Song> rockSongs = songList.stream()
                .filter( song -> song.getGenre().toLowerCase().contains("rock"))
                .collect(Collectors.toList());

        rockSongs.forEach( s -> System.out.println(s));
    }
}
