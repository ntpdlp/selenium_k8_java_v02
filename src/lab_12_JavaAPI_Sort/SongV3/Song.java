package lab_12_JavaAPI_Sort.SongV3;

public class Song {
    private String title;
    private String artistName;

    public Song(String title, String artistName){
        this.title = title;
        this.artistName = artistName;
    }

    public String getTitle() {
        return title;
    }

    public String getArtistName() {
        return artistName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artistName='" + artistName + '\'' +
                '}';
    }

}
