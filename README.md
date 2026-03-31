# PetStore API Automation Framework

## Project Overview

This project is an **API Automation Framework** built using **Rest Assured** to test the endpoints of the Swagger PetStore API.

🔗 API Under Test: https://petstore.swagger.io/

The framework is designed with **scalability, maintainability, and reusability** in mind, following industry-standard practices.

---

## Key Features

* End-to-End API Testing
* Modular and Scalable Framework Design
* Reusable API methods
* Data-driven testing support
* Detailed logging and reporting
* Assertions for response validation
* Easy integration with CI/CD tools

---

## Tech Stack

* **Language:** Java
* **Automation Tool:** Rest Assured
* **Build Tool:** Maven
* **Test Framework:** TestNG
* **Logging:** Log4j
* **Reporting:** Extent Reports
* **Version Control:** Git & GitHub

---

## Project Structure

```
PetStoreAPIAutomation
│
├── src/test/java
│   ├── api.endpoints
│   │   ├── PetEndPoints.java
│   │   ├── StoreEndPoints.java
│   │   ├── UserEndPoints.java
│   │   └── Routes.java
│   │
│   ├── api.payload.pet
│   │   ├── Pet.java
│   │   ├── Category.java
│   │   └── Tag.java
│   │
│   ├── api.payload.store
│   │   └── Store.java
│   │
│   ├── api.payload.user
│   │   └── User.java
│   │
│   ├── api.test
│   │   ├── PetTests.java
│   │   ├── StoreTests.java
│   │   ├── UserTests.java
│   │   └── DDTests.java
│   │
│   └── api.utilities
│       ├── DataProviders.java
│       ├── ExtentReportManager.java
│       ├── ResponseUtility.java
│       └── XLUtility.java
│
├── src/test/resources
│   ├── log4j2.xml
│   └── routes.properties
│
├── reports/                (Extent Reports)
├── responses/              (Saved API Responses)
│
├── pom.xml
└── testng.xml
```

---

## API Modules Covered

* Pet Module
* User Module
* Store Module

---

## Sample Test Scenarios

* **Pet Module**

Create, update, delete, fetch pet details and find pets by status

* **User Module**

Create, update, delete, and fetch user details

* **Store Module**

Place, fetch, and delete orders


---

## How to Run the Project

### 1️. Clone the Repository

```
git clone https://github.com/Raubin4321/PetStoreAutomation.git
```

### 2. Navigate to Project Folder

```
cd PetStoreAutomation
```

### 3. Run Tests Using Maven

```
mvn clean test
```

---

## Reporting

After execution, reports can be found in:

```
/test-output
```

or

```
/reports
```

---

## Framework Design Highlights

* Implements reusable API request methods
* Supports easy addition of new endpoints
* Centralized configuration management
* Follows clean coding practices

---

