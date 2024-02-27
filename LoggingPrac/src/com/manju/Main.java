package com.manju;
import org.apache.logging.log4j.*;

public class Main {

	private static Logger logger1 = LogManager.getLogger(Main.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		logger1.info("Info");
		logger1.debug("debug");
		logger1.error("Error!");
		logger1.trace("Trace");
	}

}
