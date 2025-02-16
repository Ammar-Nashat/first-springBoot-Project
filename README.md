# First Spring Boot Project

A Spring Boot application for managing employee data. This project demonstrates CRUD operations (Create, Read, Update, Delete) using RESTful APIs.

## Features

- **Create Employee**: Add a new employee to the database.
- **Get Employee**: Retrieve employee details by ID.
- **Delete Employee**: Remove an employee by ID.
- **Error Handling**: Custom exceptions and global error handling.
- **DTO Pattern**: Uses Data Transfer Objects (DTOs) to decouple API responses from the database schema.

## Technologies Used

- **Backend**: Spring Boot, Spring Data JPA, Hibernate.
- **Database**: H2 (in-memory database for development).
- **Tools**: Maven, Lombok, Postman (for API testing).
- **Language**: Java 21.

## API Endpoints

| HTTP Method | Endpoint           | Description                |
|------------|-------------------|----------------------------|
| GET        | /employees/{id}   | Get employee details by ID. |
| POST       | /employees        | Create a new employee.     |
| DELETE     | /employees/{id}   | Delete an employee by ID.  |

## Project Structure
   ```bash
src/main/java/
├── com.spring.data1.second/
│   ├── controller/        # REST controllers
│   ├── service/           # Business logic
│   ├── repository/        # Database repositories
│   ├── model/             # Entities and DTOs
│   │   ├── dto/           # Data Transfer Objects
│   │   └── entity/        # JPA Entities
│   └── exception/         # Custom exceptions and handlers
```
## How to Run the Project

### Prerequisites

- **Java 21**
- **Maven**
- **IDE** (IntelliJ IDEA, Eclipse, etc.)

### Steps

1. **Clone the repository:**  
   git clone https://github.com/Ammar-Nashat/first-springBoot-Project.git

2. **Navigate to the project directory:**  
   cd first-springBoot-Project

3. **Build the project:**  
   mvn clean install

4. **Run the application:**  
   mvn spring-boot:run

5. **Access the API at:**  
   http://localhost:8080

## Testing

Use **Postman** or **curl** to test the API endpoints.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch:  
   git checkout -b feature/your-feature
3. Commit your changes:  
   git commit -m 'Add some feature'
4. Push to the branch:  
   git push origin feature/your-feature
5. Open a **pull request**.

## Contact
- **LinkedIn**: [Ammar-Nashat](https://www.linkedin.com/in/ammar-qc)

