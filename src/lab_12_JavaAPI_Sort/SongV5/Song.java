package lab_12_JavaAPI_Sort.SongV5;

import java.util.Objects;

public class Song{
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
        return "Song{" + "title='" + title + ", artistName='" + artistName + '\'' + '}';
    }


    @Override
    public boolean equals(Object o) {
        Song song = (Song) o;
        return title.equals(song.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }


}
