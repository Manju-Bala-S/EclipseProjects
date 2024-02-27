package com.manju.DemoMB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Apps {
	private static Logger logger = LoggerFactory.getLogger(Apps.class);
	  public static void main(String[] args) {
		  MDC.put("traceId", "AppsClass");
	      logger.debug("Debug log message - Apps");
	      logger.info("Info log message - Apps");
	      logger.error("Error log message - Apps");
	      MDC.clear();
	  }
}
