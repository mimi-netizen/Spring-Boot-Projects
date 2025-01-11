# Spring Boot Projects Collection

This repository contains a collection of Spring Boot projects demonstrating various features and implementations of Spring Framework ecosystem.

## Projects Overview

### 1. FormValidationDemo
A Spring Boot application showcasing form validation techniques including:
- Client-side validation
- Server-side validation
- Custom validation annotations
- Validation error handling

### 2. HibernateDemoCRUDwithDataRest
Demonstrates integration of Hibernate with Spring Data REST:
- Basic CRUD operations
- Automatic REST endpoint generation
- HAL browser integration
- Custom repository methods

### 3. RestAPISpringSecDemo
Implementation of REST API with Spring Security:
- Basic authentication
- JWT token implementation
- Role-based access control
- Security configurations

### 4. RestAPISpringSecDemoDB
Enhanced version of REST API security with database integration:
- User management with database
- Password encryption
- Token persistence
- Custom security filters

### 5. RestAPIwithSpringDataJPAEMS
Employee Management System using Spring Data JPA:
- Complete REST API implementation
- JPA entity relationships
- Custom query methods
- Data pagination and sorting

### 6. RestApiCRUDEMS
Basic CRUD operations for Employee Management System:
- REST endpoints for employee operations
- Exception handling
- Request/Response DTOs
- Service layer implementation

## Technology Stack

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- HTML/CSS
- Maven/Gradle
- MySQL/H2 Database

## Getting Started

### Prerequisites
- JDK 11 or later
- Maven 3.6+
- Your favorite IDE (Spring Tool Suite, IntelliJ IDEA, or Eclipse)
- MySQL Server (for database projects)

### Building Projects
```bash
git clone https://github.com/mimi-netizen/Spring-Boot-Projects.git
cd Spring-Boot-Projects
cd <project-name>
mvn clean install
```

### Running Applications
```bash
mvn spring-boot:run
```

## Project Structure
Each project follows a standard Spring Boot project structure:
```
project-name/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── controllers/
│   │   │           ├── models/
│   │   │           ├── repositories/
│   │   │           ├── services/
│   │   │           └── Application.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## Features by Project

### Form Validation Demo
- Form input validation
- Display validation errors
- Custom validation rules
- Bootstrap integration for UI

### Hibernate Demo with Data REST
- Automatic REST API generation
- HATEOAS implementation
- Custom repository methods
- Database integration

### REST API with Spring Security
- Secure REST endpoints
- Authentication and authorization
- JWT token handling
- Role-based access control

### Employee Management System
- Complete CRUD operations
- Data persistence
- RESTful API design
- Exception handling

## Contributing
Contributions are welcome! Please feel free to submit pull requests.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
This project is available under the MIT License.

## Contact
[LinkedIn](https://www.linkedin.com/in/celyne-kydd/)

## Acknowledgments
- Spring Framework Documentation
- Spring Boot Reference Guide
- Spring Security Reference
- Hibernate Documentation
