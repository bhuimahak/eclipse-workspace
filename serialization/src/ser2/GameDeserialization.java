package ser2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GameDeserialization {

	public static void main(String[] args) {
		try {
			File file = new File("gameChar.ser");
			if (file.exists()) {
				FileInputStream fs = new FileInputStream("gameChar.ser");
				ObjectInputStream os = new ObjectInputStream(fs);
				GameCharacter gameObj1 = (GameCharacter) os.readObject();
				GameCharacter gameObj2 = (GameCharacter) os.readObject();
				System.out.println(gameObj1);
				System.out.println(gameObj2);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
