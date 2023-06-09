##  *Pc configurator with Spring Boot, Postgres and  Hibernate*

##  *Introduction*
 
This is a simple Pc configurator with Spring Boot, Postgres and Hibernate.



# Getting Started with Create React App
[React client Front-End](https://github.com/sezermehmed/frontend-pc-configurator)

[Admin React Front-End](https://github.com/sezermehmed/frontend-pc-configurator)

##  *Requirements*

* Any IDE (IntelliJ)
* Java 17+
* Maven
* Postgres
* Postman or any other API client
* Git
* Docker (Optional for Postgres)


##  *Steps to Setup*

**1. Clone the application**

```bash
git clone https://github.com/sezermehmed/PC-Configurator
```

**2. Database**

* setup a database in Postgres
```bash
 sudo -u postgres psql
 ```
Since the default “postgres” memory does not have a password, you should set it yourself.
```bash
\password postgres
```

**2. Create Postgres database**

```bash
CREATE DATABASE postgres;
```

**3. Change Postgres username and password as per your installation**

+ open `src/main/resources/application.properties` file.
+ change `spring.datasource.username` and `spring.datasource.password` as per your postgres installation

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/restful-0.0.1-SNAPSHOT.jar 
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

##  *Explore Rest APIs*

The app defines following CRUD APIs.

    GET /api/cpu                      or /api/memory               or /api/motherboard
    
    POST /api/cpu                     or /api/memory               or /api/motherboard
    
    GET /api/cpu/{cpuId}         or /api/memory/{memoryId}      or /api/motherboard/{motherboardId}
    
    PUT /api/cpu/{cpuId}         or /api/memory/{memoryId}      or /api/motherboard/{motherboardId}
    
    DELETE /api/cpu/{cpuId}      or /api/memory/{memoryId}      or /api/motherboard/{motherboardId}

You can test them using postman or any other rest client.

##  *Useful Articles for this project*

* [Code Structure](https://www.geeksforgeeks.org/spring-boot-code-structure/)
* [Project Structure](https://medium.com/the-resonant-web/spring-boot-2-0-project-structure-and-best-practices-part-2-7137bdcba7d3)
* [Postgres Setup](https://www.cherryservers.com/blog/how-to-install-and-setup-postgresql-server-on-ubuntu-20-04)



