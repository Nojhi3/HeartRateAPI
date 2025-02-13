# Heart Rate API - Spring Boot Backend

This is a **Spring Boot** backend for managing **users, patients, and heart rate data**. It provides **RESTful APIs** to register users, add patients, and record heart rate data.  

## Features
- User Registration & Login
- Manage Patients
- Record & Retrieve Heart Rate Data
- Swagger UI for API Documentation
- Uses H2 Database (In-Memory)
- Spring Boot 3 + JPA + Lombok

---

## Tech Stack
- Java 21+
- Spring Boot 3
- Spring Data JPA
- H2 Database
- SpringDoc OpenAPI (Swagger)
- Lombok

---

## Clone & Setup the Project
### 1. Clone the Repository
```sh
git clone https://github.com/Nojhi3/HeartRateAPI.git
cd HeartRateAPI
```

### 2. Configure the Database (H2)
H2 is an in-memory database, so no setup is required. The application is pre-configured to use H2.

Check `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

H2 Console is available at:
[http://localhost:8080/h2-console](http://localhost:8080/h2-console)

**JDBC URL:** `jdbc:h2:mem:testdb`  
**Username:** `sa`  
**Password:** (leave empty)

### 3. Build and Run the Project
Run the following commands:

```sh
mvn clean install
mvn spring-boot:run
```

The API will be available at: [http://localhost:8080](http://localhost:8080)

---

## API Endpoints

### **User Registration**
**POST** `/users/register`
#### Request Body (JSON):
```json
{
  "email": "user@example.com",
  "password": "password123"
}
```

### **User Login**
**POST** `/users/login?email=user@example.com&password=password123`

### **Add a Patient**
**POST** `/patients`
#### Request Body (JSON):
```json
{
  "name": "John Doe",
  "uniquePatientId": "12345"
}
```

### **Get All Patients**
**GET** `/patients`

### **Record Heart Rate**
**POST** `/heart-rates`
#### Request Body (JSON):
```json
{
  "bpm": 80,
  "recordedAt": "2025-02-13T12:00:00",
  "patient": {
    "id": 1
  }
}
```

### **Get Heart Rate Data**
**GET** `/heart-rates/1`

---

## API Documentation (Swagger)
Swagger UI is available at:
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

This provides:
- List of all APIs
- Try out API calls directly in the browser

---

## Run Tests
To run tests, execute:

```sh
mvn test
```

