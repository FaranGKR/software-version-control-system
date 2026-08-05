# Software Version Control System

## 📌 Project Overview
This project is a Spring Boot REST API developed using IntelliJ IDEA. It demonstrates CRUD (Create, Read, Update, Delete) operations using Java, Spring Boot, Spring Data JPA, MySQL, Git, and GitHub while following a layered architecture.

The project was created to gain hands-on experience with backend development, version control, and collaborative software development.

---

## 🚀 Technologies Used
- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- IntelliJ IDEA
- Git
- GitHub
- Postman
- Lombok
- SLF4J Logging

---

## 📂 Project Structure

```text
src
│
├── controller
│      UserController.java
│
├── service
│      UserService.java
│
├── repository
│      UserRepository.java
│
├── entity
│      UserEntity.java
│
└── resources
       application.properties
```

---

## 🏗 Architecture

### Controller Layer
- Receives HTTP requests
- Handles API endpoints
- Calls the Service layer

**Endpoints**
- `GET /user`
- `GET /user/id/{id}`
- `POST /user`
- `PUT /user/id/{id}`
- `DELETE /user/id/{id}`

### Service Layer
- Contains business logic
- Validates requests
- Calls the Repository layer

### Repository Layer
Uses Spring Data JPA.

```java
JpaRepository<UserEntity, String>
```

### Entity Layer
Represents the MySQL table using annotations:

```java
@Entity
@Table
@Id
@Column
```

---

## 🗄 Database

**Database Name**

```text
version_system
```

| Column | Type |
|--------|------|
| id | VARCHAR |
| name | VARCHAR |
| age | INT |
| phone_number | VARCHAR |

---

## ⚙ CRUD Operations

### Create User

```http
POST /user
```

```json
{
  "id": "U001",
  "name": "Ali",
  "age": 22,
  "phoneNumber": "03001234567"
}
```

### Get All Users

```http
GET /user
```

### Get User By ID

```http
GET /user/id/U001
```

### Update User

```http
PUT /user/id/U001
```

```json
{
  "id": "U001",
  "name": "Ali Ahmed",
  "age": 23,
  "phoneNumber": "03123456789"
}
```

### Delete User

```http
DELETE /user/id/U001
```

---

## 📝 Logging

Logging is implemented using Lombok's `@Slf4j`.

```java
@Slf4j

log.info("Fetching all users");

log.error("Error while fetching user", e);
```

---

## ⚠ Exception Handling

```java
try {
    // Code
} catch (Exception e) {
    // Handle Exception
}
```

---

## 📬 API Testing

APIs were tested using **Postman**.

Supported methods:
- GET
- POST
- PUT
- DELETE

---

## 🛠 MySQL Integration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/version_system
spring.datasource.username=root
spring.datasource.password=*****
```

---

## 🌿 Git Workflow

```bash
git init
git clone
git status
git add .
git commit -m "Initial Commit"
git branch
git switch
git checkout
git pull
git push
git log
```

---

## 🌐 GitHub

- Create repositories
- Clone repositories
- Connect IntelliJ with GitHub
- Create branches
- Push code
- Pull latest changes
- Work in a collaborative repository
- Resolve Git issues

---

## 💡 Key Concepts Learned

- Spring Boot Project Structure
- REST API Development
- Layered Architecture
- Controller-Service-Repository Pattern
- Entity Mapping
- CRUD Operations
- Dependency Injection
- Maven
- MySQL Integration
- Postman API Testing
- Exception Handling
- SLF4J Logging
- Lombok
- Git
- GitHub

---

## 📚 Challenges Solved

- Fixed HTTP 404 errors
- Resolved HTTP 500 errors
- Connected Spring Boot with MySQL
- Fixed data type mismatch issues
- Connected IntelliJ with GitHub
- Tested CRUD APIs using Postman
- Added logging using `@Slf4j`

---

## 👨‍💻 Contributors

- Shafaq Zaman
- Muqadas
- Uzair
- Noman
- Abdullah