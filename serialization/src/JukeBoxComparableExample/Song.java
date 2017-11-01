package JukeBoxComparableExample;

public class Song implements Comparable<Song> {

	String title;
	String artist;
	int rating;

	public Song(String title, String artist, int rating) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		return title.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Song otherSong = (Song)obj;
		return this.title.equals(otherSong.title);
	}

	@Override
	public int compareTo(Song o) {
		return this.title.compareTo(o.title);
	}

	@Override
	public String toString() {
		return "Song [title=" + title + "]";
	}
}
