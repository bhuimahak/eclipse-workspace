package xmlReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLgetData {

	Logger dataLogger = Logger.getLogger(ReadXMLgetData.class);
	Document doc = null;

	public ReadXMLgetData(String path) throws ParserConfigurationException, SAXException, IOException {
		File f = new File(path);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		this.doc = builder.parse(f);
	}

	public List<HashMap<String, String>> getDataAsList(String testCase) {

		List<HashMap<String, String>> dataList = new ArrayList<>();

		NodeList testCaseNodes = doc.getElementsByTagName(testCase);

		for (int count = 0; count < testCaseNodes.getLength(); count++) {
			Node testCaseNode = testCaseNodes.item(count);
			if (testCaseNode.getNodeType() == Node.ELEMENT_NODE) {
				Element testCaseElement = (Element) testCaseNode;
				NodeList dataNodes = testCaseElement.getElementsByTagName("Data");
				// Loop over each Data Node
				for (int c = 0; c < dataNodes.getLength(); c++) {
					Node dataNode = dataNodes.item(c);

					if (dataNode.getNodeType() == Node.ELEMENT_NODE) {
						if (dataNode.hasChildNodes()) {
							HashMap<String, String> map = new HashMap<>();
							NodeList dataItems = dataNode.getChildNodes();
							for (int counter = 0; counter < dataItems.getLength(); counter++) {
								Node dataItem = dataItems.item(counter);
								if (dataItem.getNodeType() == Node.ELEMENT_NODE) {
									String dataName = dataItem.getNodeName();
									String value = dataItem.getTextContent();
									map.put(dataName, value);
								}
							}
							dataList.add(map);
						}
					}
				}
			}

		}
		
		return dataList;
	}

}
