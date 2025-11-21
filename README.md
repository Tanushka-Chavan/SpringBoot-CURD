# Spring Boot MVC CRUD Application

This project is a simple CRUD (Create, Read, Update, Delete) application built using **Spring Boot**, **Spring MVC**, **JSP views**, and **Maven**. It demonstrates a basic login flow and user handling.

---

## 📁 Project Structure

```
springbootmvc/
│
├── .mvn/wrapper
│   └── maven-wrapper.properties
│
├── src/main/java/com/example/springbootmvc
│   ├── LoginController.java
│   ├── SpringbootmvcApplication.java
│   └── User.java
│
├── src/main/resources
│   ├── application.properties
│   └── webapp/views
│       ├── home.jsp
│       └── login.jsp
│
├── src/test/java/com/example/springbootmvc
│
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml
```

---

## 🚀 Features

* User Login Page
* Display Home Page after Login
* Basic user model
* JSP-based UI with Spring MVC
* Maven-based Spring Boot project structure

---

## 🛠 Technologies Used

* **Java 17+** (adjust based on your setup)
* **Spring Boot**
* **Spring MVC**
* **JSP** (Java Server Pages)
* **Maven**

---

## 🔧 How to Run the Project

### 1️⃣ Clone the Repository

```
git clone <your-repo-url>
cd springbootmvc
```

### 2️⃣ Build the Project

```
./mvnw clean install
```

(or `mvnw.cmd` on Windows)

### 3️⃣ Run the Application

```
./mvnw spring-boot:run
```

### 4️⃣ Access in Browser

Open:

```
http://localhost:8080/login
```

---

## 📄 Endpoints

| Endpoint     | Method | Description                       |
| ------------ | ------ | --------------------------------- |
| `/login`     | GET    | Loads login page                  |
| `/login`     | POST   | Authenticates user                |
| `/home`      | GET    | Displays home.jsp                 |
| `/user`      | POST   | Creates a new user (Create)       |
| `/user/{id}` | GET    | Fetches a user by ID (Read)       |
| `/user/{id}` | POST   | Updates an existing user (Update) |
| `/user/{id}` | DELETE | Deletes the user (Delete)         |

----------|--------|-------------|
| `/login` | GET | Loads login page |
| `/login` | POST | Authenticates user |
| `/home`  | GET | Displays home.jsp |

---

## 🧱 Folder Details

### **Controllers**

`LoginController.java` handles login form submissions and navigation.

### **Model**

`User.java` represents user data.

### **Views (JSP)**

Located in:

```
src/main/resources/webapp/views/
```

Files:

* `login.jsp`
* `home.jsp`

### **Configuration**

`application.properties` defines server configs and view resolver settings.

---

## 📦 Dependencies

Dependencies are declared in `pom.xml`. These typically include:

* spring-boot-starter-web
* spring-boot-starter-tomcat (embedded)
* spring-boot-starter-thymeleaf or JSP engine
* spring-boot-devtools

---

## 📝 Notes

* Ensure JSP support is correctly added in `pom.xml`.
* View resolver must be configured for `.jsp` files.
* Project uses embedded Tomcat.

---



## 📜 License

This project is open-source and free to use.
