package xmlReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class ReadXMLgetDataTester {

	public static void main(String[] args) {
		ReadXMLgetData reader = null;
		try {
			reader = new ReadXMLgetData("resources\\suite.xml");
		} catch (ParserConfigurationException | SAXException | IOException e) {

			e.printStackTrace();
		}
		if (reader != null) {
			List<HashMap<String, String>> list = reader.getDataAsList("ChangePassword");
			System.out.println(list);
		}

	}

}
