package HeadFirst;

public class Movie {
	String title;
	String genre;
	int rating;
	
	//construtor
	public Movie(){
		this.title = "default";
		this.genre = "gen";
		this.rating = 0;
	}
	
	public void setMovieTitle(String title){
		System.out.println("in set movie title");
		this.title = title;
	}
	
	public String getMovieTitle(){
		System.out.println("in getmovietitle method");
		return this.title;
	}
	
	
	void playIt(){
		System.out.println("Playing the movie "+ this.title);
	}

}
