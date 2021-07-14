# Hospital-Management-System
Hospital Management System using Spring Boot, Java, Spring Data Rest API
Ch

To Run the App

1. Download the code 
2. Open MySQL WorkBench
3. Select sql scripts and run them in MySQL to create database for database connection and patient database.
4. Copy CovidManager project inside a new folder
5. Open the new folder in your Eclipse IDE.
6. select import -> Maven -> Existing Maven files in Eclipse.
7. Select covidManager project inside new folder, also tick pom.xml after selecting project if it is unticked and import it.
8. select covidManger app inside covidManager pack and run as java application as tomcat server is embedded in it.
9. Open POSTMAN App and enter Url : http://localhost:8080/api/patients for getting list of patients in JSON format.
10. For inserting data, select POST instead of GET and change body type from none to raw -> JSON. Enter the input is JSON format and send it.
11. For Update, Use PUT and for Delete, use DELETE.
