package construcorsConcept;

public class Sample1 {
	
	private int size;
	private String name;

	public Sample1() {
		this.size = 10;
		this.name = "defaultName";
	}

	public Sample1(int size) {
		this();
		this.size = size;
	}
	
	public Sample1(String name) {
		this();
		this.name = name;
	}
	
	public Sample1(String name, int size) {
		this.name = name;
		this.size = size;
	}	
}
