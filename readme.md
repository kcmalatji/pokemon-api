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


#Secure Web Services
1. Web Services are secured using JWT if you try to access any of them before Authenticating you will get a 403 error
2. The username and password are pokemon:pikachu respectively
3. The only URL that can be accessed before authenticating is /auth endpoint where you will be required to pass username and password
4. I will attach the Postman collection in the code to make testing easy, Just import the collection to postman and change the urls if you are testing on docker it's going to require the context path


#To Do
2. Deploy the docker container on a cloud instance
3. Add docker step on jenkins pipeline(jenkinsfile)
