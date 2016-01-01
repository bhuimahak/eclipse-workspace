package propertiesEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		FileInputStream in1 = new FileInputStream("resources\\employees.properties");
		FileInputStream in2 = new FileInputStream("resources\\another.properties");
		
		Properties prop = new Properties();
		prop.load(in1);
		prop.load(in2);

//		String empname = prop.getProperty("random");
//		System.out.println(empname);
//		String name = (String)prop.getOrDefault("name", "arslan");
//		System.out.println(name);

		Set<String> propertyNames = prop.stringPropertyNames();
		for(String propertyName: propertyNames) {
			String propertyValue = prop.getProperty(propertyName);
			System.out.println("Key: " + propertyName + ", Value: " + propertyValue);
		}
		
//		Set<Entry<Object, Object>> propertiesSet = prop.entrySet();
//		for(Entry<Object, Object> p : propertiesSet) {
//			String key = (String) p.getKey();
//			String value = (String) p.getValue();
//			System.out.println("Key: " + key + ", Value: " + value);
//		}
	}
}
