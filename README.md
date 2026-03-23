# PetStore API Automation Framework (Rest Assured)

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
PetStoreAPIAutomation/
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── api.endpoints/
│   │   │   │   ├── PetEndPoints.java
│   │   │   │   ├── Routes.java
│   │   │   │   ├── StoreEndPoints.java
│   │   │   │   ├── UserEndPoints.java
│   │   │   │
│   │   │   ├── api.payload/
│   │   │   │   ├── Pet.java
│   │   │   │   ├── Store.java
│   │   │   │   ├── User.java
│   │   │   │
│   │   │   ├── api.test/
│   │   │   │   ├── DDTests.java
│   │   │   │   ├── PetTests.java
│   │   │   │   ├── StoreTests.java
│   │   │   │   ├── UserTests.java
│   │   │   │
│   │   │   ├── api.utilities/
│   │   │       ├── DataProviders.java
│   │   │       ├── ExtentReportManager.java
│   │   │       ├── XLUtility.java
│   │
│   ├── test/
│       └── resources/
│           ├── log4j2.xml
│           ├── routes.properties
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

## Pet Module

* Create, update, delete, and fetch pet details
* Find pets by status
* Positive & negative validations

## User Module

* Create, update, delete, and fetch user details
* User login & logout
* Positive & negative validations

## Store Module

* Place, fetch, and delete orders
* Positive & negative validations

---

## How to Run the Project

### 1️⃣ Clone the Repository

```
git clone https://github.com/Raubin4321/PetStoreAutomation.git
```

### 2️⃣ Navigate to Project Folder

```
cd PetStoreAutomation
```

### 3️⃣ Run Tests Using Maven

```
mvn clean test
```

---

## 📊 Reporting

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

