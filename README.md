# Marketplace API

![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.2-6DB33F?logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36?logo=apachemaven&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green.svg)

Simple marketplace API built with Spring Boot. The focus is product creation and persistence in an in-memory H2 database.

**Technologies**
- Java 21
- Spring Boot 4.0.2
- Spring Web MVC
- Spring Data JPA (Hibernate)
- H2 Database (in-memory) + H2 Console
- Lombok
- Maven (wrapper `mvnw`)

**Requirements**
- JDK 21
- Permission to run `./mvnw` (Linux/macOS) or `mvnw.cmd` (Windows)

**How to run**
1. `./mvnw spring-boot:run`
2. The API starts by default at `http://localhost:8080`

**Build and run the jar**
1. `./mvnw clean package`
2. `java -jar target/marketplace-api-0.0.1-SNAPSHOT.jar`

**Endpoints**
- `POST /products` creates a product.

Example:
```bash
curl -X POST http://localhost:8080/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Mouse","description":"Wireless","priceInCents":19990}'
```

Expected response:
```json
{
  "id": "generated-uuid",
  "name": "Mouse",
  "description": "Wireless",
  "priceInCents": 19990
}
```

**Database and H2 Console**
- JDBC URL: `jdbc:h2:mem:marketplace`
- Username: `sa`
- Password: `h2pass`
- Console: `http://localhost:8080/h2-console`

**Initialization**
- The schema is created via `src/main/resources/data.sql` (table `product`).

**Tests**
1. `./mvnw test`

**License**
- MIT License. See `LICENSE`.

**Author**
- Nicolas Teófilo de Castro
- Email: `nicolasteofilodecastro@gmail.com`
- GitHub: `github.com/nicolasteofilo`
