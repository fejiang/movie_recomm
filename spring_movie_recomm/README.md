
Prerequisite: 
1. JDK 1.8+

&nbsp;

To start the application, execute one of the following two commands: 

if in Windows environment

```
> mvnw spring-boot:run
```
or, if in *nix environment

```
> ./mvnw spring-boot:run
```

&nbsp;

To test with cURL, execute the following command, it should return the list of 
the recommended movies for the user (user ID: 1) in JSON format: 

```
> curl http://localhost:8080/movierecomm/1
```

To test with the unit tests of Spring framework: 

Terminate the application running process (`mvnw spring-boot:run`) and execute 
one of the following commands: 

if in Windows environment

```
> mvnw test
```

or, if in *nix environment

```
> ./mvnw test
```


