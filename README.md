# <h1 align="center"> University Event Managment </h1>
<p align="center">
<a href="Java url">
<img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
<img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
<img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />

</p>

 

---

 

<p align="left">

 

## Overview

 

The University Event Managment is a simple Spring Boot application that allows you to add, get, update and delete Events & Students with endpoint has been accessed. It also provides an additional feature to add all the data in database.

 

## Technologies Used

 

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven
- **Database:** H2 Database

 

## Data Flow

 

The University Event Managment application follows a structured data flow pattern to handle requests and manage data efficiently:

 

### Controller

 

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for various operations, including adding Events & Students, retrieving Events & Students, and updating Events & Students. Each endpoint maps to a specific service method to ensure proper request handling and response generation.

 

```java
@RestController
public class Event & Student Controller {

    @Autowired
    Events & Studentservice myEvent & Student;

    @PostMapping("Events & Students")
    public String addAllEvents & Students(@RequestBody List<Event & Student> newEvent & Student){
        return myEvent & Student.addAllMyEvents & Students(newEvent & Student);
    }
    .
    .
    .
}
```

 

### Service

 

The Service layer encapsulates the core business logic and data processing. It interacts with the repo layer to retrieve and store data. In this application, it handles operations like adding Events & Students, retrieving Events & Students, and updating Events & Students for company. The Service layer validates input data and performs necessary operations before returning results to the Controller.

 

```java
@Service
public class Events & Studentservice {
    @Autowired
    IEvent & StudentRepo Event & StudentRepo;

    public String addAllMyEvents & Students(List<Event & Student> newEvent & Student) {
        Event & StudentRepo.saveAll(newEvent & Student);
        return newEvent & Student.size()+" Events & Students added successfully";
    }
 

    // Service methods for various operations
    // ...
}
```

 

### Model

 

The model layer manages data access to in-memory storage. It maintains a list of `Event & Student Controller` objects to store uploaded Events & Students. Also I have a Entity Type for Event & Student type. While this in-memory storage is suitable for a simple application, in a production environment, a database should be used for data persistence.

 



## Database Design

 

The University Event Managment application utilizes a simple in-memory data structure to store all the Events & Students. In a production environment, it is advisable to replace this in-memory storage with a relational or NoSQL database for better data persistence and scalability.

 

### In-Memory Data Structure

 

The primary data structure used in this application is a `H2 Database`. This structure allows for easy manipulation of Events & Students data but is not suitable for long-term data storage.

 



 

## Data Structures Used


### List
Basically I used List for giving the list of my Events & Students to add in database also I for getting I used List.



 

### UrlHitCounter Class

 

The `Event & Student` class defines the structure for all the datamember. It includes ten fields: Event & StudentId, Event & StudentTitle, Event & StudentDescription, companyLocation, salary, companyEmail, companyName, employerName, Event & StudentType, appliedDate.

 
 

 




 

## Usage

 

1. Use a tool like [Swagger IO](https://swagger.io/) to make HTTP requests to the provided endpoints.


 

## Project Structure

 

The project follows a standard Spring Boot application structure with components organized into layers:

 

- **Controller:** Handles incoming HTTP requests and defines API endpoints.
- **Service:** Implements business logic and interacts with the repository.
- **Repository:** Manages data access and storage.
- **Model:** Defines data models.
- **BeanManager:** Contains Spring bean configurations.

 

## Data Storage

 

All the data will store in H2 Database.

 

## Contributing

 

Contributions to this project are welcome! If you have any suggestions, find issues, or want to enhance the functionality, please feel free to open an issue or submit a pull request.

 

 

<!-- Acknowledgments -->
## Acknowledgments
Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

 

<!-- Contact -->
## Contact
For questions or feedback, please contact [Rebel Sk](mailto:iamrebelsk@gmail.com).
