# 🛒 E-commerce Application (Spring Boot)

A secure e-commerce backend built with **Spring Boot**, using:
- ✅ JWT Authentication
- ✅ Spring Security with CSRF
- ✅ Spring Web (REST APIs)
- ✅ Maven for build management

---

## 🚀 Features

- User authentication with JWT
- Role-based access control
- CSRF protection enabled
- Product upload with images (Multipart)
- RESTful API endpoints
- Maven-based project structure

---

## 📦 Tech Stack

| Layer        | Technology             |
|--------------|------------------------|
| Backend      | Spring Boot, Java      |
| Security     | Spring Security, JWT   |
| Build Tool   | Maven                  |
| Database     | MySQL / PostgreSQL     |
| API Design   | REST, Spring MVC       |

---

## 🔐 JWT Configuration

- Secret and expiration time are stored in environment variables:
```properties
JWT_SECRET=YourSecretKeyHere
JWT_EXPIRATION_MS=86400000  # 1 day

🔒 CSRF Protection
CSRF protection is enabled by default in Spring Security.

Stateless endpoints using JWT do not require CSRF tokens.

If using cookies/sessions, enable CSRF in security config.

ecommerce/
├── src/main/java/com/example/ecommerce/
│   ├── controller/        # REST controllers
│   ├── model/             # Entity classes
│   ├── repository/        # JPA Repositories
│   ├── security/          # Security config, JwtUtil, filters
│   ├── service/           # Business logic
│   └── EcommerceApplication.java
├── src/main/resources/
│   ├── application.properties
├── pom.xml

🛠️ Build and Run
bash
Copy
Edit
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run

📂 API Endpoints
Method	Endpoint	Description
POST	/auth/login	Authenticate and get JWT
GET	/products	Get all products
POST	/products/upload	Upload product + image



