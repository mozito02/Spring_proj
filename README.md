
# Student Management System

This is a Student Management System project built using Spring Boot, Spring MVC, Thymeleaf, and MySQL. The project demonstrates the basic functionalities of a CRUD (Create, Read, Update, Delete) application for managing student data.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Screenshots](#screenshots)
- [License](#license)

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- Bootstrap
- MySQL
- Maven

## Project Structure

```plaintext
.
├── .idea
├── .mvn
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.abir.student
│   │   │       ├── controller
│   │   │       │   └── StudentController.java
│   │   │       ├── entity
│   │   │       │   └── Student.java
│   │   │       ├── repository
│   │   │       │   └── StudentRepository.java
│   │   │       ├── services
│   │   │       │   └── StudentService.java
│   │   │       │   └── StudentServiceImpl.java
│   │   │       └── StudentApplication.java
│   │   └── resources
│   │       ├── static
│   │       │   └── images
│   │       │       ├── landing.png
│   │       │       └── sm_background.jpg
│   │       ├── templates
│   │       │   ├── create_student.html
│   │       │   ├── edit_student.html
│   │       │   ├── landing.html
│   │       │   └── students.html
│   │       └── application.properties
├── target
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/mozito02/Spring_proj.git
   cd Spring_proj
   ```

2. **Configure MySQL:**
   - Create a database named `student_management` in your MySQL server.
   - Update the `application.properties` file with your MySQL configurations.
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/student_management
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build and run the project:**
   ```sh
   ./mvnw spring-boot:run
   ```

## Usage

Once the application is running, you can access it at `http://localhost:8080`.

## Endpoints

- **GET** `/students` - List all students
- **GET** `/students/new` - Show form to create a new student
- **POST** `/students` - Save a new student
- **GET** `/students/edit/{id}` - Show form to edit an existing student
- **POST** `/students/{id}` - Update an existing student
- **GET** `/students/{id}` - Delete a student
- **GET** `/` - Redirect to the landing page
- **GET** `/landing` - Show the landing page



## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
