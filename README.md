# hostelbooking

This repository contains a **Hostel Booking System** built using **Java** with JDBC and Swing for GUI-based management. The goal is to efficiently manage hostel accommodations, student records, and room allocations.

## Plan

1. **Database Setup**  
   - Configure MySQL database and tables for students and rooms.  
   - Implement database connection using JDBC.

2. **Command-Line Interface (CLI) Implementation**  
   - Develop core functionalities for adding and viewing students and rooms via CLI.

3. **Graphical User Interface (GUI) Development**  
   - Implement a Swing-based UI for student registration and room management.

## Features

- Add and view student records.
- Add and view room details.
- Basic database operations using **MySQL**.
- GUI-based student registration.

## Technologies Used

- **Java** (Core Java, JDBC, Swing for GUI)
- **MySQL** (Database for student and room records)
- **JDBC** (Database connectivity)

## Setup Instructions

### Prerequisites

Ensure you have the following installed:

- **Java JDK** (Version 8 or later)
- **MySQL Server**
- **MySQL Connector for Java** (JDBC Driver)

### Database Configuration

1. Create a MySQL database:
   ```sql
   CREATE DATABASE hostel_management;
   ```
2. Use the database:
   ```sql
   USE hostel_management;
   ```
3. Create tables:
   ```sql
   CREATE TABLE Students (
       student_id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100),
       email VARCHAR(100),
       phone VARCHAR(15),
       address VARCHAR(255),
       dob DATE
   );

   CREATE TABLE Rooms (
       room_id INT AUTO_INCREMENT PRIMARY KEY,
       room_number VARCHAR(10),
       capacity INT,
       occupancy INT DEFAULT 0
   );
   ```
4. Update the **DBConnection.java** file with your database credentials if necessary:
   ```java
   private static final String USER = "root";
   private static final String PASSWORD = "your_password";
   ```

### Running the Application

#### CLI Version

Compile and run using:

```sh
javac *.java
java HostelManagement
```

#### GUI Version

Compile and run using:

```sh
javac *.java
java HostelManagementGUI
```

## Future Improvements

- Room allocation automation.
- Admin login system.
- Enhanced UI design.

## License

This project is open-source under the **MIT License**.

## Contributors

Feel free to contribute by submitting a **pull request** or reporting issues in the repository!

