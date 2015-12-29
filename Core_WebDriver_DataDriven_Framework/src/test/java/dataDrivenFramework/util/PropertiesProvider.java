package dataDrivenFramework.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesProvider {
	private static Properties prop = null;

	public static void init() {
		if (prop == null) {
			System.out.println("Initializing properties in init.");
			String path = System.getProperty("user.dir") + "\\src\\test\\resources\\project.properties";
			prop = new Properties();
			try {
				FileInputStream fs = new FileInputStream(path);
				prop.load(fs);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String getProperty(String propertyName) {
		init();
		return prop.getProperty(propertyName);
	}
}
