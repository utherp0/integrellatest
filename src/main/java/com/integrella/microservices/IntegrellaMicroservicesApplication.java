package com.integrella.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * Main Application starter class. 
 * Note1: Spring Boot Annotations 
 * Note2: In order to leverage Spring Integration, \@ImportResource is used to load the Spring bean configuration file	
 * 
 * This example can be closed from the console, but this shouldn't exist in a real application.
 * 
 * @author Kashim
 *
 */
@SpringBootApplication
@ImportResource("IntegrellaMicroservicesApplication.xml")
public class IntegrellaMicroservicesApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext ctx = new SpringApplication(IntegrellaMicroservicesApplication.class).run(args);
        System.out.println("Integrella Microservices Producer started.\nHit Enter to terminate");
        System.in.read();
        ctx.close();
	}
}