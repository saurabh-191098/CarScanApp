# CarScanApp


			                                                  CarScanApp Project In Spring Boot

### Introduction ###

	This "CarScanApp" Project created in spring boot. It having model layer, repository layer, service layer, controller layer. And for testing Restful API's just use "Postman".
	
	The "pom.xml" file having dependecies like spring data jpa, spring starter web, spring devtools, Mysql connector. And the "application.properties" file using for making connection with Mysql server. 
	
	The "CarScanAppApplication" java file from package "com.example.main" is the main spring boot application file.
	
	And the "UserEntity" java file from package "com.example.main.model" is the entity class, which having id, fname, lname, dob, city, phone, etc. entities. And it also having paremetrized and default constructor, getter and setter.
	
	And "UserRepo" is the interface java file from package "com.example.main.repo" extend the properties of JpaRepository. JpaRepository provide multiple methods to perform operation with database.
	
	And "UserService" is the interface java file from package "com.example.main.service", which containining all abstract methods which required to wirte for business logic.
	
	And "UserServiceImpl" is the main service java file from package "com.example.main.serviceImpl" which contains the methods implementation of "UserService" file. In each implemented method, they use the Jpa's method to perform all operations.
	 
	 And "UserController" is the Restcontroller java file from package "com.example.main.controller", which having all API's.
	


### Steps to run project and Testing all API's ###


1) Fistly, Goto Project name(CarScan_App) on project explorer, And then right click, go on "Run As" and click on "Spring Boot App". Then, app gonna run.

[Testing "POST" Api :- Using to add user]
2) Now, Open "Postman" application, Enter the Url as "localhost:8089/User/Create" select mapping as "POST", select "Body/raw/Json" and enter the data in json format and click on "SEND" button. [Note:- Using server port 8089]. Belows are Entities.
	  i) fname (DataType:-String)
	 ii) lname (DataType:-String)
  	iii) dob   (DataType:-Date, format ex:-01/01/2022)
  	 iv) city  (DataType:-String)
  	  v) phone (DataType:-long)

3) Then, it will shown "User saved".	 

[Testing "GET" Api :- Using to show users]
4) Now, enter the url "localhost:8089/User/Show" select mapping as "GET" and click on "SEND" button.

5) Then it shows all the users.

[Testing "PUT" Api :- Using to edit user]
6) Now, enter the url "localhost:8089/User/Edit" select mapping as "PUT", select "Body/raw/Json" and enter the data in json format and click on "SEND" button.Belows are Entities. Value of "Id" is mandatory and other's are optional. 
	  i) id (DataType:-long)    
	 ii) fname (DataType:-String)
	iii) lname (DataType:-String)
  	 iv) dob   (DataType:-Date, format ex:-01/01/2022)
  	  v) city  (DataType:-String)
  	 vi) phone (DataType:-long)
  	 
 7) Then, it will shown "User edited".
 
 [Testing "DELETE" Api :- Using to delete user]
 8) Now, enter the url "localhost:8089/User/Delete/{id}" select mapping as "DELETE" and click on "SEND" button. [Note :- Enter the user id in {id} field of url, which one want to delete]
 
 9) Then, it will shown "User deleted".
 	  
  	 
  	 
  	 
