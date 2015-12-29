package HeadFirst;

public class Song {
	String title;
	String artist;
	
	
	public void setTitle(String title){
		this.title = title;
		}
	
	public String getTitle(){
		return title;
	}
	
	public void setArtist(String artist){
		this.artist = artist;
	}
	
	public String getArtist(){
		return artist;
	}
	
	void play(){
		System.out.println("I am playing song having title: " + title);
		}

	public static void main(String[] args) {
	 
		Song s1 = new Song();
		s1.setArtist("floyd");
		//s1.artist = "Me";
		s1.setTitle("Travis");
		//play(s1); //why this is not working? and if I want title to be displayed in quotes in the console, how to do that?
		
		Song s2 = new Song();
		s2.setArtist("pink");
		s2.setTitle("My way" );
		s1.play();
		s2.play();
		//s1 = s2;
		if(s1==s2) // how to implement equals method ina class? if(s1.equals(s2))..is this correct or its only for strings?
			System.out.println("s1 and s2 refer to the same object");
		else
			System.out.println("s1 and s2 refer to two diffrent objects");
		
}
	
	public int cal(){
		byte x = 2;
		return x;
	}

}
