package javaenums;

import javaenums.Juice;
import javaenums.Juice.JuiceSize;

public class JuiceTest{
	
	public static void main(String[] args) {
		JuiceSize f = JuiceSize.LARGE;

		Juice freshJuice = new Juice();
		freshJuice.size = f;
		System.out.println(freshJuice.size);

	}
}
