package writingAProgram;

public class SimpleDotComGame {

	public static void main(String[] args) {
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		int numOfGuesses = 0;
		boolean isAlive = true;
		
			//generate a random number between 0 and 7
		int randomNum = (int)(Math.random()*5);
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		theDotCom.setLocationCells(locations);
		
		
		
		while(isAlive){
			//ask user for a guess from a game helper class
		String guess = helper.getUserInput("Enter a number");
		String result = theDotCom.checkYourself(guess);
		numOfGuesses++;
		
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("you sunk the dot com");	
				System.out.println("you took total guesses: " +numOfGuesses);
			}	
		}
		System.out.println("ratings are as under: ");
		switch(numOfGuesses){
		case 3:
			System.out.println("wow");
			break;
		case 4:
		case 5:
		 System.out.println("Fine");
		 break;
		case 6:
		case 7:
			System.out.println("bad");
		default:
			System.out.println("whatever");
			
		}
		
		
		
		/*if((numOfGuesses >= 3) && (numOfGuesses < 5))
			System.out.println("good");
		    
		if((numOfGuesses >=5) && (numOfGuesses <= 9))
			System.out.println("not bad");
		
		if (numOfGuesses <= 9)
			System.out.println("Poor"); */
	} 
	

}
