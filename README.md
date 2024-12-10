# Java 23 Spring Boot MongoDB Community Project

This project is built using **Java 23**, **Spring Boot**, and **MongoDB Community**. It provides a simple Todo application with basic CRUD operations.

## Prerequisites

Before running the application, make sure you have the following installed on your machine:

- [Java 23](https://adoptopenjdk.net/) or a compatible version of JDK.
- [Docker](https://www.docker.com/) installed and running.
- [Maven](https://maven.apache.org/) (optional if you are using `./mvnw`).

## Running the MongoDB Database with Docker

To start the MongoDB database, follow these steps:

1. Navigate to the `mongodb` directory:

    ```bash
    cd mongodb
    ```

2. Run the Docker Compose command to start the MongoDB container:

    ```bash
    docker-compose up
    ```

This will set up and run the MongoDB Community edition locally, which the Spring Boot application will connect to.

## Running the Application

After the MongoDB database is running, you can start the Spring Boot application:

1. Navigate to the root directory of the Spring Boot project.

2. Run the application using Maven:

    ```bash
    ./mvnw spring-boot:run
    ```

   Alternatively, if Maven is installed globally, you can use:

    ```bash
    mvn spring-boot:run
    ```

The application should now be running locally. You can access it at `http://localhost:8080`.

## API Documentation

This project uses **Swagger** to document the API endpoints.

- Visit `http://localhost:8080/swagger-ui.html` to access the Swagger UI and see the available endpoints.

## Project Structure

- **src/main/java** - Java source files for the Spring Boot application.
- **src/main/resources** - Configuration files like `application.yml`.
- **mongodb** - Docker-related files to run MongoDB.

## Notes

- Make sure Docker is running and properly configured to start the MongoDB container.
- The application connects to MongoDB with default credentials and database settings.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
