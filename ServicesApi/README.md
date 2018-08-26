# NewtonX
## Project Title:RESTEasy WebService Application

### Motivation:Newtox back end assignment challenge

### Technology/Framework Used
  Java 8,Jackson RESTEasy, Maven, Apache Tomcat (7 and above)

## Features:
   In this application basic create read update delete operations have been implemented and hosted via separate URI requests  using rest easy API. Below are the features and its URI

### Get all the users
  GET: http://localhost:8080/ServicesApi/user

### Get specific user details
  GET: http://localhost:8080/ServicesApi/user/{id}

### Add a New User
  POST: http://localhost:8080/ServicesApi/user
  #### Sampel Request Header and Body
      Request Header 
        Content-Type: application/json
      JSON Request Body
        {
          "firstName":"value",
          "lastName":"value"
        }
### Update User details
  PUT: http://localhost:8080/ServicesApi/user/2
  #### Sampel Request Header and Body
      Request Header 
        Content-Type: application/json
      JSON Request Body
        {
          "id":value,
          "firstName":"value",
          "lastName":"value"
         }

### Delete User
  DELETE: http://localhost:8080/ServicesApi/user/2

## Installation:
  ### In order to run this project below software is required
    Java 8
    Tomcat version 7 and above 

### API Reference
   https://github.com/resteasy/Resteasy

## How to use:
  Download the project from git hub repository from https://github.com/pratinya/newtonx_services
  Use eclipse IDE, java 8 & tomcat 7 and above version to run the project on your local machine.
  Once the application starts ,please use above mentioned URI's in features section to launch application and perform CRUD operations.

## Note
  HashMap is used in DAO layer to store the USER objects in memory instead of a Database. It is just to avoid external datatabase dependencies during the setup and execution.
