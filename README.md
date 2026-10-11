# BDCC-IOC — Dependency Injection with Spring

## 📌 Project Description

This project demonstrates **Inversion of Control (IoC)** and **Dependency Injection (DI)** using Java and the Spring Framework.

The objective is to understand how dependency injection reduces coupling between classes and improves application flexibility and maintainability.

## 🎯 Objectives

- Understand Inversion of Control (IoC).
- Implement dependency injection using Java interfaces.
- Apply the principle of loose coupling.
- Separate the data access layer from the business layer.
- Configure dependencies using Spring XML.
- Explore static and dynamic instantiation.

## 🛠️ Technologies Used

- Java
- Spring Framework
- Maven
- XML
- IntelliJ IDEA

## 📂 Project Structure

```text
BDCC-IOC/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── net/ayman/
│   │   │       ├── dao/
│   │   │       ├── ext/
│   │   │       ├── metier/
│   │   │       └── pres/
│   │   └── resources/
│   │       └── config.xml
│   └── test/
├── screenshots/
│   ├── project-structure.png
│   ├── spring-config.png
│   └── execution-result.png
├── pom.xml
└── README.md
```

## 🧩 Main Components

### 1. DAO Layer

The Data Access Object (DAO) layer provides data through the `IDao` interface and its implementation, `DaoImpl`.

### 2. Business Layer

The business layer uses the `IMetier` interface and its implementation, `MetierImpl`, to perform calculations using data provided by the DAO layer.

### 3. Presentation Layer

The presentation layer contains the main class used to run the application and display the results.

### 4. Spring Configuration

The `config.xml` file defines Spring beans and configures dependencies between application components.

## ⚙️ Dependency Injection

This project explores dependency injection and the relationship between interfaces and implementations.

The main concepts include:

- **Static instantiation:** Creating dependencies directly in the code.
- **Dynamic instantiation:** Selecting and creating implementations dynamically.
- **Spring XML configuration:** Managing dependencies through the Spring IoC container.

## 🚀 How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/AymanAsghar/dependency-injection-spring.git
   ```

2. Open the project in IntelliJ IDEA.
3. Allow Maven to download the required dependencies.
4. Check the configuration file at `src/main/resources/config.xml`.
5. Run the main class in the `pres` package.

## 📸 Screenshots

### Project Structure

![Project Structure](screenshots/project-structure.png)

### Spring XML Configuration

![Spring Configuration](screenshots/spring-config.png)

### Application Execution

![Execution Result](screenshots/execution-result.png)

## 📚 Learning Outcomes

Through this project, I learned how to:

- Apply IoC and dependency injection principles.
- Use interfaces to achieve loose coupling.
- Organize a Java application into separate layers.
- Manage project dependencies with Maven.
- Configure Spring beans using XML.

## 👨‍💻 Author

**Ayman Asghar**

Engineering Student — Cybersecurity

## 🎓 Project Context

Academic project developed to practice Java, object-oriented programming, and dependency injection with Spring.

---

*Developed for educational purposes.*
