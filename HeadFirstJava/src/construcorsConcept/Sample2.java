package construcorsConcept;

public class Sample2 {
	
	private int size;
	private String name;

	public Sample2() {
		this.size = 10;
		this.name = "defaultName";
	}

	public Sample2(int size) {
		this.size = size;
		this.name = "Name";
	}
	
	public Sample2(String name) {
		this.name = name;
		this.size = 4;
	}
	
	public Sample2(String name, int size) {
		this.name = name;
		this.size = size;
	}	
}
