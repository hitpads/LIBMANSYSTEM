# Library Management System

## Overview
This project is a simple library management system implemented in Java. It allows users to add books, list books, and sort them by title. The system uses various design patterns such as Observer, Strategy, Builder, Decorator, etc.

## Features
- Add new books to the library
- List all books in the library
- Sort books by title
- Observer pattern to notify changes
- Builder pattern for creating book instances
- Decorator pattern for extending book functionality

## Project Structure
- `src/Main.java`: Entry point of the application.
- `controller/LibraryController.java`: Manages the library operations.
- `view/ConsoleView.java`: Handles user interactions via the console.
- `model/Book.java`: Represents a book entity.
- `model/BookBuilder.java`: Builder class for creating `Book` instances.
- `structural/BookDecorator.java`: Decorator class for `Book` instances.
- `behavioral/LibraryObserver.java`: Observer for library changes.
- `behavioral/BookObserver.java`: Observer for book changes.
- `behavioral/TitleSort.java`: Strategy for sorting books by title.

## Getting Started
1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/library-management-system.git
    ```
2. Navigate to the project directory:
    ```sh
    cd library-management-system
    ```
3. Compile the project:
    ```sh
    javac -d bin src/**/*.java
    ```
4. Run the application:
    ```sh
    java -cp bin Main
    ```

## Usage
- Follow the on-screen instructions to add or list books.
- Enter `0` to exit the application.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the MIT License.
