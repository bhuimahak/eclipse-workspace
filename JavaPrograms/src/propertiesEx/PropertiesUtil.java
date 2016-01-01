package propertiesEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	private static final Properties prop;
	//static block loads at the time the class loads, no need to create object to use the method
	static
	{
		prop = new Properties();
		FileInputStream in;
		try {
			in = new FileInputStream("resources\\application.properties");
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String propertyName) {
		return prop.getProperty(propertyName);
	}
}
