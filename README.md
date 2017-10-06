# Integrella Microserices Architecture for Integration

This project forms part of the Suite of products that offer Inegration services in a Microservice Architecture

## This project - Microservices Producer

This is a starter project to demonstrate the use of Spring Integration and Spring Boot to develop a simple, configurable Microservice which picks up data from a queue, performs some optional transformation and pushes it to an output queue. The queue infrastructure must be AMQP compliant and this project uses RabbitMQ as the provider. 

## Getting Started

Download the project to your local eclipse installation. 

### Prerequisites

Your Eclipse Installation needs to have the Spring Tool Suite Addon

For this project to execute, you'll need a Rabbit MQ server to connect to. 

* If you have a local installation, and it's running on the default settings, then the application will automatically pick up the server details and connect to it. i.e.

	http://localhost:15672 guest/guest

* For an external server, connection details can be configured in the src\main\resources\IntegrellaMicroservicesApplication.xml file in the <!-- INFRASTRUCTURE --> section. 

### Executing

Once the project is in your workspace, run the application as a Spring Boot Application. 

Open the a browser @ http://localhost:15672

The following queues are defined:
q.adapter.inbound
q.mdm.esb

Publish a message to q.adapter.inbound
It will be picked up, transformed to UPPERCASE and published to q.mdm.esb

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

Use maven to create the required jars to execute as a standalone application. 

You can run the application using 

	./mvnw spring-boot:run. 

Or you can build the JAR file with
	 
	 ./mvnw clean package. 

Then you can run the JAR file:

	java -jar target/integrella-microservices-producer-1.0.0.jar


## See also

* **integrella-microservices-consumer**
* **integrella-microservices-producer-scheduled**
* **integrella-microservices-producer-xslt**


## Authors

* **Kashim Choudhury** (initial version)

