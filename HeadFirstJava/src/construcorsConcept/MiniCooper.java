package construcorsConcept;

public class MiniCooper extends Car {
	
	private int size;
	
	public MiniCooper(){
		this("car");
	}

	public MiniCooper(int size) {
		this();
		this.size = size;
	}
	
	public MiniCooper(String name) {
		this(name, 10);
	}	
	
	public MiniCooper(String name, int size) {
		super(name);
		this.size = size;
	}
}
