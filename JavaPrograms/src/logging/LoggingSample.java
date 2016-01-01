package logging;

import org.apache.log4j.Logger;

import java.io.*;

public class LoggingSample {

	private static Logger log = Logger.getLogger(LoggingSample.class);

	public static void main(String[] args) throws IOException {
		log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
		AnotherClass an = new AnotherClass();
		an.someMethod();
	}
}