package xmlReader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLReader {

	public Company startParsing() {
		List<Staff> staffList = new ArrayList<Staff>();

		try {
			File fXmlFile = new File("resources\\staff.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			//System.out.println("Array List size: " + staffList.size());
			// optional, but recommended
			// read this -
			// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("staff");
//			NodeList nList = doc.getChildNodes();

			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					Staff staffObject = new Staff();

					String staffId = eElement.getAttribute("id");
					staffObject.setId(Integer.parseInt(staffId));
					String firstName = eElement.getElementsByTagName("firstname").item(0).getTextContent();
					staffObject.setFirstName(firstName);
					String lastName = eElement.getElementsByTagName("lastname").item(0).getTextContent();
					staffObject.setLastName(lastName);
					String nickName = eElement.getElementsByTagName("nickname").item(0).getTextContent();
					staffObject.setNickName(nickName);
					String salary = eElement.getElementsByTagName("salary").item(0).getTextContent();
					staffObject.setSalary(Integer.parseInt(salary));

					System.out.println(staffObject);
					staffList.add(staffObject);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Company comp = new Company();
		comp.setStaffList(staffList);
		return comp;
	}

}