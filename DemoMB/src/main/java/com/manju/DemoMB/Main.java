package com.manju.DemoMB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
  public static void main(String[] args) {
	  MDC.put("traceId", "MainClass");
      logger.debug("Debug log message- Main");
      logger.info("Info log message - Main");
      logger.error("Error log message - Main");
      MDC.clear();
  }
}
