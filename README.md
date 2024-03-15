# RMI-Calculator

This project showcases a simple implementation of a Remote Method Invocation (RMI) calculator in Java. The application is divided into two main components: a `server` that provides mathematical operations as services, and a `client` that consumes these services to perform calculations.

## Server

### Services

- **InterfServiceDistant:** A remote interface that declares methods for basic arithmetic operations: addition, subtraction, multiplication, and division. It includes handling for division by zero through a custom exception.
- **ImplServiceDistant:** This class implements the `InterfServiceDistant` interface, providing the logic for each arithmetic operation. A `DividedByZeroException` is thrown if a division by zero is attempted.

### Main Server Class

- **Server:** Initializes the RMI environment, creates an instance of `ImplServiceDistant`, and binds it to the RMI registry, making it available for clients to perform operations.

## Client

- **Client:** Interacts with the user to input two operands and an operation symbol. It then looks up the remote service in the RMI registry and invokes the corresponding method based on the user's input. The result or an error message is displayed back to the user.

## Setup and Execution

### Server

1. Navigate to the server's root directory.
2. Compile the Java files in the `ma/fstm/ilisi/rmicalculator/server` directory.
3. Run the `Server` class to start the RMI registry and bind the calculator service.

### Client

1. Ensure the server is running and accessible.
2. Navigate to the client's root directory.
3. Compile the Java files in the `ma/fstm/ilisi/rmicalculator/client` directory.
4. Run the `Client` class, input operands and an operation when prompted, and view the result.

### Prerequisites

- Java Development Kit (JDK) installed on both the server and client machines.
- The server and client must be able to communicate over the network if they are on different machines.

## Note

This example provides a basic demonstration of RMI in Java for performing arithmetic operations. It includes custom exception handling for division by zero. The purpose is educational, to illustrate how RMI can be used to invoke remote methods in a distributed system.
