package xmlReader;

public class ReadXMLTester {

	public static void main(String[] args) {

		ReadXMLRecursive reader = new ReadXMLRecursive("resources\\suite.xml");
		reader.startParsing();

	}

}
