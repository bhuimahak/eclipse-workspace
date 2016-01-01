package logging;

import org.apache.log4j.Logger;

public class AnotherClass {
	private static Logger log = Logger.getLogger(AnotherClass.class);

	public AnotherClass() {
		log.debug("In constructor debug.");
		log.info("In constructor info.");
	}
	
	public void someMethod() {
		log.debug("Calling the method debug.");
		log.info("Calling the method info.");
	}
}
