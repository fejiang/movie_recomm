
Prerequisites: 
1. JDK 1.8+
2. Play framework 1.5+ (available [here](https://downloads.typesafe.com/play/1.5.3/play-1.5.3.zip))

&nbsp;

To download the dependency libraries, execute the following command: 
```
> play deps
```

To start the server, execute the following command: 
```
> play run
```
&nbsp;

To test with cURL, execute the following command, it should return the list of 
the recommended movies for the user (user ID: 1) in JSON format: 
```
> curl http://localhost:9000/movierecomm/1
```
&nbsp;

To test with the test runner of Play framework:
1. Terminate the server running process (`play run`) and execute the following command: 
```
    > play test
```
2. Navigate to http://localhost:9000/@tests
3. On the web page, select the "functional test" then click on the "Start!" button

