
public enum Colour {
	RED("Square", "redCode"),
	GREEN("Triangle", "greenCode"),
	BLUE("Hexagon", "blueCode");
	
	private String hexcode;
	private String shape;
	
	Colour(String shape, String hexcode){
		this.shape = shape;
		this.hexcode = hexcode;
	}
	
	public String getHexcode(){
		return this.hexcode;	
	}

	public String getShape() {
		return shape;
	}
}
