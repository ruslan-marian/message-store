# Message Store

This exercise is a RESTful API to work as a basic message store.



## Quick start

1. Use Git to clone this repo.
1. To build the project: `./mvnw clean install`.
1. To serve it: `./mvnw spring-boot:run`.
1. To test: `http://localhost:8080`.



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



## References

[Spring Initializr](https://start.spring.io/)  
[Building REST Services with Spring](https://spring.io/guides/tutorials/rest/)  

