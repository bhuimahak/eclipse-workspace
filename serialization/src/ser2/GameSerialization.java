package ser2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GameSerialization {

	public static void main(String[] args) {

		GameCharacter gameObj1 = new GameCharacter();
		gameObj1.setName("Mahak");
		gameObj1.setPower(4);
		String[] weapons = { "knife", "sword" };

		gameObj1.setWeapons(weapons);

		GameCharacter gameObj2 = new GameCharacter();
		gameObj2.setName("Ashu");
		gameObj2.setPower(5);

		System.out.println(gameObj1);
		System.out.println(gameObj2);

		ObjectOutputStream os = null;
		try {
			FileOutputStream fs = new FileOutputStream("gameChar.ser");
			os = new ObjectOutputStream(fs);

			os.writeObject(gameObj1);
			os.writeObject(gameObj2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
