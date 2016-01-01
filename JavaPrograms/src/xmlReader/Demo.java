package xmlReader;

public class Demo {
	public static void main(String[] args){
		XMLReader reader = new XMLReader();
		Company comp = reader.startParsing();
		System.out.println(comp);
	}

}
