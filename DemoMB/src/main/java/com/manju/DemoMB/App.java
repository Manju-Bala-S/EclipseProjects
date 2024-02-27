package com.manju.DemoMB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LoggerFactory.getLogger(App.class);
	  public static void main(String[] args) {
		  MDC.put("traceId", "AppClass");
	      logger.debug("Debug log message- App");
	      logger.info("Info log message- App");
	      logger.error("Error log message- App");
	      MDC.clear();
	  }
}
