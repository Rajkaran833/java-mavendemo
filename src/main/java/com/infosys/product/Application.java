package com.infosys.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
static final Logger logger= LoggerFactory.getLogger(Application.class);
	public static void main(String[] args)
	{
		logger.debug("This is a debug message");
		logger.info("this is a info message");
		logger.warn("this is a warning message");
		logger.error("this is an error message");
	}

}
