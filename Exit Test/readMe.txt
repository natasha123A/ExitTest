This is an Angular + SpringBoot projet. In which user can perform search of products as per their requirements.
Three Fields are given 

1) Search By Product Name
2) Search By Product Brand (dropdown column fetched from database)
3) Search By Product Code

if No inputs are provided all the products stored in DataBase will be shown as a result.
Any One input provided, it will fetch according to it.

/**************************************************************************************************/

Creating the DB:
This project uses MySQL. Kindly Create the DataBase

ALL THE QUERIES OF CREATION AND INSERTION IS PROVIDED FOR TESTING PURPOSE
RUN THIS PROJECT ONLY AFTER THE dB SCHEMA IS CREATED

(All Queries are in file "mySQLQueries.sql"

Execute it on MySQL Workbench 

/**************************************************************************************************/


The Frontend (Angular)=>
1) To Run this first check the modules if not then using terminal/cmd kindly install the required modules 
   by typing "npm install"

2) To Run use either "ng serve" or "nodemon" (if present)

3) by default Angular works on port 4200, If not just type ng serve --port XXXX

Access the page by this URL => localhost:4200     /* by default is 4200 */ 


/***************************************************************************************************/

The BackEnd (SpringBoot)=> 

1) Using Eclipse Install Dependencies 

/************  NOTE:  DONT USE HIBERNTE-CORE 5.6.7+   USE OLDER VERSION => RECOMMENDED 5.6.5  ***************/    

(reason: 5.6.7 + has bugs and are incompatible with springboot API Request. requests will not work the second time if used)

if its taking 5.6.7 then change the build configuration and manually add 5.6.5 jar files

2) To RUN SIMPLY RUN IT as SPRING BOOT APPLICATION.


/***************************************************************************************************/


DO NOT CREATE USER USING QUERY MANUALLY => USE THE FRONTEND REGISTRATION PORTAL.SINCE THE PASSWORD WILL BE ENCRYPTED IN DB. 

MIGHT CAUSE PROBLEM IN AUTHENTICATING 



