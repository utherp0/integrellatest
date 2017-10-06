package com.integrella.microservices.transformer;

import org.apache.log4j.Logger;

public class TransformMessage {
	
	private static Logger logger = Logger.getLogger(TransformMessage.class);
	
	
	public String transform(String message){
		logger.info("Original message received by transformer: " + message);
		logger.info("New message is: " + convert(message));
		return convert(message);
	}
	
	
	/*
	public String transform(String data){
		//String message = new String (data);
		logger.info("Original message received by transformer: " + data);
		logger.info("New message is: " + convert(data));
		return convert(data);
	}
	*/
	
	private String convert(String message){
		return message.toUpperCase();
	}
	
	

}
