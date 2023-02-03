#Application Resources

1. Get all Pokemon  _pokemon/api/v1/pokemon-list_
2. get Pokemon By name (pass name=zubat as a query param)  _pokemon/api/v1/pokemon?name=zubat_
3. Get Pokemon Details (pass id=1 as a query param)  _pokemon/api/v1/pokemon-details?id=1_

#Notes
###Running the application locally
1. Use command    _mvn Spring-boot:run_
2. The application will spin an internal Tomcat server 
3. And you can access the application on default port of **8080** eg **http://localhost:8080** and append the below resources
4. When application is running locally it doesn't have Context path.

###Running the application on Docker locally
1. The application comes with context path of DOCKER_URL:PORTS/pokemonApi-1.0.0-SNAPSHOT
2. The application is deployed on wildfly server therefore we are pulling a **wildfly image** running on **centos** with **java 17**

###Running the application on Docker on cloud
1. Not yet deployed to cloud, information will be shared once done

#To Do
1. Secure the webservices with jwt
2. Deploy the docker container on a cloud instance
3. Add docker step on jenkins pipeline(jenkinsfile)
