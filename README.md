
> ## _**Note:** This project was built and tested on a machine running Java 8_

## Setup

### 1. Build the JAR package
`./mvnw package`

### 2. Build the Docker image and run it as a container
`docker-compose up --build`

## Usage

### Prime number API endpoint
Go to: http://localhost/api/primenumber/{num}

Insert a non-negative integer number in place of _{num}_

> The input is validated in case an undesired value is provided

### Swagger UI
Availabe at: http://localhost/swagger-ui.html
