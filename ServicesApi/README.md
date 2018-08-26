######
#Project Title:RESTEasy WebService Application

#Motivation:Newtox back end assignment challenge

#Technology/Framework Used
#Technologies Used: Java 8,Jackson rest easy, Maven

#Features:In this application basic create read update delete operations have been implemented and hosted via separate URI requests using rest easy API. Below are the features and its URI

#GET: http://localhost:8080/ServicesApi/user

#POST: http://localhost:8080/ServicesApi/user
#Requires JSON input in the below format
#{"firstName":"value",
#"lastName":"value"}

#PUT: http://localhost:8080/ServicesApi/user/2
#Requires JSON input in the below format
#{"id":value,
#"firstName":"value",
#"lastName":"value"}

#DELETE: http://localhost:8080/ServicesApi/user/2

#To keep things simple and to run the application easily ,i have used a hashmap in DAO layer to store the USER objects instead of a Database.


#Installation:
#In order to run this project below software is required

#Java 8
#Tomcat version 7 and above 

#API Reference
#Jackson resteasy

#How to use:

#download the project from git hub repository
#https://github.com/pratinya/newtonx_services
#Use eclipse IDE, java 8 & tomcat 7 and above version to run the project on your local machine.
#Once the application starts ,please use above mentioned URI's in features section to launch application and perform CRUD operations.





