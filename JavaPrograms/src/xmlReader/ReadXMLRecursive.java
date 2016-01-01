package xmlReader;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLRecursive {

	Logger xmlLogger = Logger.getLogger(ReadXMLRecursive.class);
	String path = null;
	File f = null;

	public ReadXMLRecursive(String path) {
		this.path = path;
		f = new File(path);

	}

	public void startParsing() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		Document doc;

		try {
			docBuilder = factory.newDocumentBuilder();
			doc = docBuilder.parse(f);
			doc.getDocumentElement().normalize();
			Node root = doc.getDocumentElement();
			System.out.println("root node is: " + root.getNodeName());
			printNodes(root);

		} catch (ParserConfigurationException e1) {
			xmlLogger.error(e1.getMessage());
			e1.printStackTrace();
		} catch (SAXException e) {
			xmlLogger.error(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			xmlLogger.error(e.getMessage());
			e.printStackTrace();
		}
	}

	public void printNodes(Node n) {
		if (n.getNodeType() == Node.ELEMENT_NODE) {
			System.out.println(n.getNodeName());
			if (n.hasChildNodes()) {
				NodeList childNodes = n.getChildNodes();
				for (int count = 0; count < childNodes.getLength(); count++) {
					Node child = childNodes.item(count);
					printNodes(child);
				}
			}

		}
		else if(n.getNodeType() == Node.TEXT_NODE && !n.getNodeValue().trim().isEmpty()) {
			System.out.println(n.getNodeValue());
		}

	}

}