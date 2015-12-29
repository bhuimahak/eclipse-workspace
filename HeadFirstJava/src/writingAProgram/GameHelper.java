package writingAProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
	
	public String getUserInput(String prompt){
		System.out.println(prompt + "");
		String inputLine = null;
		try {
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		
			inputLine = is.readLine();
			if(inputLine.length() == 0)
				return null;
		} catch (IOException e) {
			System.out.println("IO Exception" +e);
			e.printStackTrace();
		}
		
		
		return inputLine;
	}

}
