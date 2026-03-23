# 🐾 PetStore API Automation Framework (Rest Assured)

## 📌 Project Overview

This project is an **API Automation Framework** built using **Rest Assured** to test the endpoints of the Swagger PetStore API.

🔗 API Under Test: https://petstore.swagger.io/

The framework is designed with **scalability, maintainability, and reusability** in mind, following industry-standard practices.

---

## 🚀 Key Features

* End-to-End API Testing
* Modular and Scalable Framework Design
* Reusable API methods
* Data-driven testing support
* Detailed logging and reporting
* Assertions for response validation
* Easy integration with CI/CD tools

---

## 🛠️ Tech Stack

* **Language:** Java
* **Automation Tool:** Rest Assured
* **Build Tool:** Maven
* **Test Framework:** TestNG / JUnit
* **Logging:** Log4j
* **Reporting:** Extent Reports / Allure Reports
* **Version Control:** Git & GitHub

---

## 📂 Project Structure

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

## 🔄 API Modules Covered

* Pet Module
* User Module
* Store Module

---

## 🧪 Sample Test Scenarios

* Create a new pet
* Get pet details by ID
* Update pet information
* Delete pet
* Validate response status and body
* Negative test scenarios

---

## ▶️ How to Run the Project

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

## 🔧 Framework Design Highlights

* Uses **Separation of Concerns**
* Implements reusable API request methods
* Supports easy addition of new endpoints
* Centralized configuration management
* Follows clean coding practices

---

