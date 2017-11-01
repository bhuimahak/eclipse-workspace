package ser2;

import java.io.Serializable;
import java.util.Arrays;

public class GameCharacter implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int power;
	String[] weapons;
	String name;
	
	public GameCharacter(){
		System.out.println("In game character constructor");
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String[] getWeapons() {
		return weapons;
	}
	public void setWeapons(String[] weapons) {
		this.weapons = weapons;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "GameCharacter [power=" + power + ", weapons="
				+ Arrays.toString(weapons) + ", name=" + name + "]";
	}

}
