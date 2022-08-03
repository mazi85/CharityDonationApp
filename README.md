# Charity donation app

App for manage charity donations. 
User after registration and login can donate unnecessary things to chosen charity institution.

## App feature 

1. Common
   - user registration with confirmation done by email and token SSID
   - login feature with validation if logging user is admin or client
   - logout feature

2. USER/ role user
   - add charity donation feature with summary before submit donation form
   - manage added donations, possibility to mark when donation was picked-up by delivery company
   - manage actualy logged user profile
   
3. USER/ role admin
   Has possibilities in admin panel 
   - manage charity institutions
   - manage users
   - manage admins

## Technology stack

- back-end langugages: JAVA
- frameworks: Spring Boot, Spring Data JPA, Spring Security, Hibrenate,
- databases: MySQL,
- libraries: Lombok,
- web container: Apache Tomcat,
- front-end: JSP, HTML, JS, Bootstrap

## Requirements:

1. Local mySQL DB name "charity_donation" schema.
   If You use other DB please fill application.properties file according to Your DB
2. Fill in application.properties your e-mail serwer
3. For creating first user with admin role You have to proceed all registration procedure in app. When You finish You have to manually change role of created user from 'user' to 'admin' in DB.

## Scopes that can be developed in the future

1. All form validations
2. Tests
3. Password validations
4. Support for forgotten passwords  (using e-mail and SSID)

