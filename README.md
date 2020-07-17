# SB_MicroServices_JPA_MovieCatalog

A spring boot based project containing 3 microservices 



Movie Catalog service:
======================
-> For a user, returns a list of Movie names, Movie description and ratings by calling two different services

Rating Data service:
=====================
-> For a user, gives the list of Movie names and rating details
-> Also supports APIs for adding, updating and deleting movie ratings

Movie Info service
=====================
-> For a movie, gives the Movie description 
-> Also supports APIs for adding, updating and deleting movie info

Flow
====================
For a given username 'Movie Catalog service' first calls 'Rating data service', 
gets all the movie names list and rating, then for each movie calls 'Movie info service'

Uses
======================
- Java 13, Spring boots, Spring Cloud, Rest template
- JPA & mySQL
- Used Eureka for service discovery.

======================
Configure the Rating data service and Movie info service's application.properties to connect to the databases and
create tables for Rating and Movie. 

Rating(rid,username,moviename,rating)
Movie( name, description)

CREATE TABLE movie (
name VARCHAR(30) PRIMARY KEY,
description VARCHAR(30)
)

CREATE TABLE rating (
rid INTEGER  PRIMARY KEY,
username VARCHAR(30) NOT NULL,
moviename VARCHAR(30) NOT NULL,
rating INTEGER
)

