# Project S04T02N02 - CRUD with Spring Boot and MySQL

## Description

This project implements a basic CRUD for the **Fruit** entity using Spring Boot, Spring Data JPA, and MySQL database.

The `Fruit` entity has the following properties:

- `id` (int): Auto-generated unique identifier.
- `name` (String): Name of the fruit.
- `quantityKilos` (int): Quantity in kilos.
  

---

## Technologies Used

- Java 11+
- Spring Boot
- Spring Data JPA
- MySQL Database
- Docker (for MySQL)  
- Maven
- Postman (for API testing)

---

## Running the Project

1. Clone this repository.
2. Open the project in your favorite IDE (IntelliJ, Eclipse, VSCode).
3. Run the main class `S04T02N02Application`.

---

## Available Endpoints

| Action                 | Method | URL                     | Description                    | JSON Body Example                                          |
|------------------------|--------|-------------------------|--------------------------------|------------------------------------------------------------|
| Create fruit           | POST   | `/fruit/add`            | Add a new fruit                | `{ "name": "Apple", "quantitatQuilos": 25 }`               |
| Update fruit           | PUT    | `/fruit/update`         | Modify an existing fruit       | `{ "id": 1, "name": "Golden Apple", "quantityKilos": 30 }` |
| Delete fruit           | DELETE | `/fruit/delete/{id}`    | Delete fruit by id             | N/A                                                        |
| Get fruit by id        | GET    | `/fruit/getOne/{id}`    | Get fruit by its id            | N/A                                                        |
| Get all fruits         | GET    | `/fruit/getAll`         | Get all fruits                 | N/A                                                        |

---
