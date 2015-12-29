package writingAProgram;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs){
	locationCells = locs;	
	}
	
	public String checkYourself(String stringGuess){
		String result = "miss";
		int guess = Integer.parseInt(stringGuess);
		for(int cell : locationCells){
			if(cell == guess){
				numOfHits++;
				result = "hit";
				break;
				
			}
		}
		if(numOfHits == locationCells.length){
			result = "kill";
		}
		System.out.println("Result is: " + result);
		return result;
	}
}
		


