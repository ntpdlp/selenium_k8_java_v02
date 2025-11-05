package lab_12_LambdaStream.Example01;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPuzzle {
    public static void main(String[] args) {
        SongSearch songSearch = new SongSearch();
        songSearch.printTopFiveSongs();
        songSearch.search("The Beatles");
        songSearch.search("Vo");
    }
}

class SongSearch{
    private final List<Song> songs = SongFactory.getSongs();

    void printTopFiveSongs(){
        List<String> topFive = songs.stream()
                .sorted(new Comparator<Song>() {
                    @Override
                    public int compare(Song o1, Song o2) {
                        return o2.getTimesPlayed() - o1.getTimesPlayed();
                    }
                })
                .map(Song::getTitle)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(topFive);
    }


    void search(String artist){
        Optional<Song> result = songs.stream()
                .filter(song -> song.getArtist().equalsIgnoreCase(artist))
                .findFirst();

        if(result.isPresent()){
            System.out.println(result.get().toString());
        }else {
            System.out.println("No songs found by " + artist);
        }
    }
}
