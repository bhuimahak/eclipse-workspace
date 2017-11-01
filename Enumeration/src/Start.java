public class Start {

	public static void main(String[] args) {
		Colour c = Colour.BLUE;
		Start s = new Start();
//		s.chooseColour(c);
//		System.out.println(c.getHexcode());
		s.drawShape(c, 20);

	}

	public void chooseColour(Colour colour) {

		switch (colour) {
		case BLUE:
			System.out.println("blueCode");
			break;
		case RED:
			System.out.println("redCode");
			break;
		case GREEN:
			System.out.println("greenCode");
			break;
		}

	}

	public void drawShape(Colour c, int size) {
		draw(c.getShape(), size, c.getHexcode());
	}

	private void draw(String shape, int size, String hexCode) {
		System.out.println(shape + " with size: " + size + ", Hex Code: " + hexCode);
	}

}
