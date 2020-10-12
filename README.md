
### Prerequisites
1. JDK 1.8+
2. Play framework 1.5+ (available [here](https://downloads.typesafe.com/play/1.5.3/play-1.5.3.zip))

### Procedure

1. To download the dependency libraries, execute the command `play deps`.
2. To start the server, execute the command `play run`.
3. Testing  
	1. To test with cURL, execute the command `curl http://localhost:9000/movierecomm/1`, 
		it should return the list of the recommended movies for the user (user ID: 1) in JSON format.   
	2. To test with the test runner of Play framework:  
    ....1. Terminate the server running process (`play run`) and execute the command `play test`.  
    ....2. Navigate to [http://localhost:9000/@tests](http://localhost:9000/@tests).  
    ....3. On the web page, select the "functional test" option then click on the "Start!" button.  

### Alternative implementation

There is another version of this application implemented in Spring framework, 
which is under the `spring_movie_recomm` directory.

### Migration to microservices

Each of the models (`Genre`, `Movie`, `MovieGenre`, etc.) would be assigned a dedicated 
server instance for handling a set of related services. Each server would contain 
a full set of components, e.g., controller, database, which contains all the 
related tables used by the model. 

The inter-process communications between the services would be implemented using 
remote procedure invocation or messaging. These components would replace the method calls 
among the models in the monolithic architecture. 

The corresponding database tables of the models would be restrictively separated 
into different databases or different schemas of a shared database. 

Additional components would be needed, for examples, service registry for service discovery, API gateway for routing requests for different frontends, circuit breaker for handling service failures, Saga for data consistency, etc.. 

