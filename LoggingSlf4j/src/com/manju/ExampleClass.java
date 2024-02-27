package com.manju;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleClass {

    private static final Logger logger = LoggerFactory.getLogger(ExampleClass.class);

    public static void main(String[] args) {
        logger.info("This is an info message.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
    }
}
