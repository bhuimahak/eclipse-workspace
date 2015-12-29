package HeadFirst;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean isp1Right = false;
		boolean isp2Right = false;
		boolean isp3Right = false;
		
		int targetNumber = (int)(Math.random()*10);
		System.out.println("I am thinking of a number between 0 and 9...");
		//number of times loop ran
		int counter =0;
		
		while(true){
			//number to be guessed
			System.out.println("number to be guessed is: "+targetNumber);
			
			//ask players to guess
			guessp1 = p1.guessnumber();
			System.out.println("Player1 guessed" + p1.number);
			guessp2 = p2.guessnumber();
			System.out.println("Player2 guessed" + p2.number);
			guessp3 = p3.guessnumber();
			System.out.println("Player3 guessed" + p3.number);
			
			counter++;
			
			if(targetNumber==guessp1){
				System.out.println("p1 is winner");
				break;
			}
			else if(targetNumber==guessp2){
				System.out.println("p2 is winner");
				break;
			}
			else if(targetNumber==guessp3){
				System.out.println("p3 is winner");
				break;
			}

			else
				System.out.println("no winner--guess again");

		}
		System.out.println("number of times loop ran is: " + counter);
	}

}
