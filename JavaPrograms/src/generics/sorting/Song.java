package generics.sorting;

public class Song implements Comparable<Song> {

	private String title;
	private String artist;
	private String rating;

	public Song(String title, String artist, String rating) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}

	@Override
	//sort on the basis of title
	public int compareTo(Song o) {

		return title.compareToIgnoreCase(o.getTitle()); // calling String's compareTo()
												// method to sort alphabetically
	}

	public int hashCode() {
		return title.hashCode();
	}

	public boolean equals(Object o){
		Song other = (Song) o;
		if(this == other){
			return true;
		}
		if(other == null){
			return false;
		}
		if(this.getClass() != other.getClass()){
			return false;
		}
		if(this.getTitle().equalsIgnoreCase(other.getTitle())){
			return true;
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", rating=" + rating + "]";
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

}
