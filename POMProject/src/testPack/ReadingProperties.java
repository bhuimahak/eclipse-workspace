package testPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		String path = "src//com//PomModel//config//config.properties";
		
		try {
			FileInputStream fs = new FileInputStream(path);
			prop.load(fs);
			String value = prop.getProperty("testSiteLandingpageUrl");

		} catch (IOException e) {
			System.out.println("File was not found!");
			e.printStackTrace();
		}

	}

}
