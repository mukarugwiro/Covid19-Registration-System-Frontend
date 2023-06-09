# Covid19-Registration-System

## SCOPE

My project is about COVID-19 VACCINATION registration system. It will be registering 
patients with all the required information and validate the type of vaccination they have received 
and provide cards.

This project was built using Java as the programming language, and Java Servlets and JSPs. PostgreSql was used as the database management system.

## Requirements

### Functional requirements
1. The system should allow authorization and authentication
2. The system should allow the admin to register a new patient
3. The system should allow the admin to view all registered patients and their details
4. The system should allow the admin to update the records
5. The system should allow the admin to delete the records

### Non-functional requirements
#### Security
1. The system must be able to hide the users sensitive information
2. The system must encrypt user password
3. A user has to login to perform any useful action
#### Privacy
1. The system shall be able to protect the user’s privacy.
#### Availability
1. The system shall have high availability
2. The system shall not have unexpected downtime
#### User friendly
1. The System must be user friendly
2. The system must be easy for a user to use.
#### Accessibility
1. The system must be accessible via laptop or any mobile device.
2. The system must be accessible by authorized users.

## Database Schema
![Project view](https://github.com/mukarugwiro/Covid19-Registration-System-Frontend/blob/main/database_diagram.png)

## User Documentation
To use this application, you log in using the username and password.
The main user of the application is the doctor who vaccinates the patient and register dozes taken by the patient.
The doctor also can update a patients dozes by searching them first using and new dozes.

A patient is also able to view their vaccination dozes by using a designated link and use their national id to get their vaccination information.

## Technical Documentation
The project was implemented using JAVAEE, using Servlets and JSPs. The database used was PostgreSQL. 
The project is made of two apps. A Main application that works as the front-end and a backend application.
The link to the backend app: https://github.com/mukarugwiro/Covid19-Registration-System-RestAPI

