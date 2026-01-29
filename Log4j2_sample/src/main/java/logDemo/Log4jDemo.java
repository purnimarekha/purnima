package logDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	    private static final Logger logger = LogManager.getLogger(Log4jDemo.class);

	    public static void main(String[] args) {
	    	System.out.println("Hello World");
	        logger.info("This is information message");
	        logger.trace("This is debug Message");
	        logger.debug("debug mode");
	        System.out.println("Completed");
	        
	    }
	}
	
