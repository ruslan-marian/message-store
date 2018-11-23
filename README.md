# Message Store

This exercise is a RESTful API to work as a basic message store.



## Quick start

1. Use Git to clone this repo.
1. To build the project: `./mvnw clean install`.
1. To serve it: `./mvnw spring-boot:run`.
1. To test: `http://localhost:8080`.
1. To shutdown: send `POST` to `http://localhost:8080/actuator/shutdown`



## Project description

The project is built with [Spring Boot](http://spring.io/projects/spring-boot) 
using these Starters and dependencies:

1. Web - Full-stack web development with Tomcat.
1. JPA - Java Persistence API including spring-data-jpa, spring-orm and Hibernate
1. H2 - H2 database (with embedded support)
1. HATEOAS - HATEOAS-based RESTful services
1. DevTools - Spring Boot Development Tools

The embedded database is initialized automatically at startup. This is
enabled by placing the **data.sql** file in the `src/main/resources` folder.



## Endpoints

1. `POST:  /actuator/shutdown` Shuts down the server.  
    [http://localhost:8080/actuator/shutdown](http://localhost:8080/actuator/shutdown)

1. `GET:  client/{client_id}` Retrieves a client by its id.  
    [http://localhost:8080/client/1](http://localhost:8080/client/1)

1. `GET:  message/messageid:{message_id}` Retrieves a message by its id.  
    [http://localhost:8080/message/messageid:1](http://localhost:8080/message/messageid:1)

1. `GET:  message/messageid:{message_id}/clientid:{client_id}` Retrieves a message of a client.  
    [http://localhost:8080/message/messageid:1/clientid:1](http://localhost:8080/message/messageid:1/clientid:1) 

1. `GET:  message/clientid:{client_id}` Retrieves all available messages of a client.  
    [http://localhost:8080/message/clientid:1](http://localhost:8080/message/clientid:1)

1. `POST: message/clientid:{client_id}` Creates a new message for given client.  

1. `PUT   message/messageid:{message_id}/clientid:{client_id}` Creates a message for given client.  



## References

[Spring Initializr][1]  
[Building REST Services with Spring][2]  
[Shutdown a Spring Boot Application][3]  

[1]: https://start.spring.io/
[2]: https://spring.io/guides/tutorials/rest/
[3]: https://www.baeldung.com/spring-boot-shutdown

