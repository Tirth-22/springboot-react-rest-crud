# springboot-react-rest-crud

## This project demonstrating CRUD operations. Spring Boot provides RESTful APIs, while React.js consumes these APIs for a responsive frontend.

## 🛠️ Tech Stack
- **Backend:** Spring Boot, Spring Data JPA, Hibernate, MySQL  
- **Frontend:** React.js, Axios, Bootstrap  
- **Tools:** Maven, Postman, Visual Studio Code / IntelliJ IDEA

### REST Annotations 

This project follows a RESTful architecture using Spring Boot. Below are the key annotations used:

| Annotation        | Description                                                                        |
| ----------------- | ---------------------------------------------------------------------------------- |
| `@RestController` | Marks the class as a REST controller (combines `@Controller` and `@ResponseBody`). |
| `@RequestMapping` | Maps HTTP requests to controller classes or methods.                               |
| `@GetMapping`     | Handles HTTP **GET** requests — used for fetching data.                            |
| `@PostMapping`    | Handles HTTP **POST** requests — used for creating new records.                    |
| `@PutMapping`     | Handles HTTP **PUT** requests — used for updating existing data.                   |
| `@DeleteMapping`  | Handles HTTP **DELETE** requests — used for deleting records.                      |
| `@PathVariable`   | Binds URL path parameters (e.g., `/products/{id}`) to method parameters.           |
| `@RequestBody`    | Binds the HTTP request body to a Java object.                                      |
| `@ResponseStatus` | Defines the HTTP status code for a specific method response.                       |
| `@Autowired`      | Injects dependencies automatically.                                                |
| `@Service`        | Marks a class as part of the service layer.                                        |
| `@Repository`     | Marks a class as part of the data access layer.                                    |
| `@Entity`         | Defines a JPA entity mapped to a database table.                                   |

## 🚀 How to Run

### Backend (Spring Boot)
1. Clone the repository  
   ```bash
   git clone https://github.com/your-username/springboot-react-rest-crud.git
2. Navigate to the backend folder
  ```bash
    cd backend
  ```
3. Run the Spring Boot app
    ```bash
    mvn spring-boot:run
    ```
4. Frontend (React)
   ```bash
   cd frontend
   npm install
   npm start
   ``` 
