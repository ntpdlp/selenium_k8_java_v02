package lab_12_JavaAPI_Sort.SongV6;

public class Song implements Comparable<Song>
{
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
        return "Song{" + "title='" + title + "', artistName='" + artistName + '\'' + '}';
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


    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }
}
