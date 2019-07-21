package webdriver_jun12;

import org.apache.log4j.Logger;

public class log4jDemo {

	static Logger log = Logger.getLogger(log4jDemo.class.getName());
	log.info("This is information page");
	log.warn("This is warning page");
	log.error("There is an error");
		
	
	
}
