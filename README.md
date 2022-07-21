# Taxi Service
***
#### A single web-application:

The Taxi Service application provides an opportunity to register new 
and authorize existing drivers in the database. 
It is also possible to add new cars to the database, 
the main information about which consists of the model and manufacturer.
A car manufacturer should be created before adding a car. 
The user of the Taxi Service can add a driver to the car, 
and one car can have several drivers, and one driver can drive several cars.
Can be used to keep records 
of taxi service drivers and cars

---
#### Features:
* driver registration
* adding cars, drivers, and manufacturers
* add drivers to car
***
### Technologies used:
* Apache Tomcat (as servlet container)
* MySQL, MySQL Workbench
* JDBC
* Servlet
* JSTL
* Maven Checkstyle Plugin

***
### Getting started:
Before you begin, make sure you have all the below installed:
* Tomcat (as servlet container)
* MySQl (as DB), MySQL Workbench

Next steps:
1. Fork and clone this project
2. Set up the configuration for Tomcat
3. To get the actual parameters of the database tables, run script from the resources/init_db.sql file in the Workbench.
4. To connect to database in your application you need change configuration information in the file from /util/ConnectionUtil.java to the ones you specified when installing MySQL
  Finally, you can start the application
