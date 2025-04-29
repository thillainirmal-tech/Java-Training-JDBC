# 🗄️ Java JDBC Example

This project demonstrates how to use **JDBC (Java Database Connectivity)** to interact with a relational database. It shows how to connect to a database, execute queries, and handle results.

---

## 📌 Features

- Connect to a MySQL database
- Perform basic CRUD operations
- Use `PreparedStatement` to prevent SQL injection
- Close connections properly

---

## 📂 Project Structure

jdbc-example/ │ ├── src/ │ └── JdbcDemo.java │ ├── README.md └── LICENSE

pgsql
Always show details

Copy

---

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- MySQL or any JDBC-compatible database
- MySQL JDBC driver (add to classpath)

### Setup

1. **Database Setup**

```sql
CREATE DATABASE testdb;
USE testdb;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100)
);
