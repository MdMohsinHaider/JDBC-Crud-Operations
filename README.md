# JDBC CRUD Operations

This project demonstrates the implementation of **CRUD** (Create, Read, Update, Delete) operations using **JDBC (Java Database Connectivity)** with a relational database.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [License](#license)

---

## Overview

The **JDBC CRUD Operations** project is a simple Java application showcasing how to interact with a database using **JDBC API**. It includes methods to:
- Insert new records
- Read and display records
- Update existing records
- Delete records

This project is beginner-friendly and serves as a foundation for understanding how Java applications communicate with databases.

---

## Features

- Modular code structure for database operations.
- Supports SQL-based relational databases (e.g., MySQL, PostgreSQL).
- Clean and reusable code for CRUD functionalities.
- Provides simple logging for operation success or failure.

---

## Technologies Used

- **Java** (JDK 8+)
- **JDBC API**
- **MySQL** (or any preferred RDBMS)
- **Maven** (optional for dependency management)

---

## Setup

### Prerequisites
1. Install Java (JDK 8 or higher).
2. Install and configure a database (e.g., MySQL).
3. Set up a database schema and table for CRUD operations.

### Database Table Example
```sql
CREATE DATABASE jdbc_crud_db;

USE jdbc_crud_db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    age INT
);
