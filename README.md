# TrackProgress - Employee Management App

## Introduction

**TrackProgress** is a comprehensive Android application designed to streamline employee management, providing distinct portals for both administrators and employees. The application employs advanced features like password hashing using bcrypt for enhanced security. In this report, we will explore the key features, functionalities, and technologies used in the development of the TrackProgress app.

## Features and Functionalities

### 1. Splash Screen

To provide a visually appealing and smooth user experience, the TrackProgress app begins with an engaging splash screen.

### 2. Secure User Authentication

- **Password Hashing:** The app incorporates a robust authentication system with bcrypt password hashing, ensuring the secure storage of user passwords.
- **Default Admin Account:** Admin credentials (Username: `Admin`, Password: `DefaultAdmin`) are automatically created upon installing the app, providing seamless access for the administrator.

### 3. Persistent Login

The application uses SharedPreferences to store login session information. This ensures that users do not need to repeatedly enter their credentials, enhancing the overall user experience.

### 4. Different Portals

- TrackProgress is equipped with two separate portals: one for administrators and the other for employees.
- Upon login, users are directed to the appropriate portal based on their role. This ensures a tailored and efficient user experience.

### 5. Admin Portal

- **Employee Management:** Administrators have extensive privileges, including the ability to create and remove employee accounts.
- **Task Assignment:** Admins can assign tasks to employees, track task completion, and view pending tasks for specific employees.
- **Leave Management:** Admins can approve or reject leave requests from employees.
- **Query Resolution:** Administrators can resolve queries raised by employees, fostering effective communication and issue resolution.

### 6. Employee Portal

- **Employee Access:** Employees log in using credentials created by the admin.
- **Leave Requests:** Employees can apply for leave, ensuring smooth leave management.
- **Query Raising:** Employees can raise queries to seek clarification or resolution on various issues.
- **Task Completion:** Employees have the ability to mark tasks assigned by the admin as completed, providing transparency in task management.

### 7. Covered Topics

The TrackProgress app encompasses a wide range of Android development topics, including:
- Implementation of a captivating splash screen.
- Efficient data storage using Room Database.
- Displaying data through ListView and custom adapters.
- Navigation through Fragments for an organized and intuitive user experience.
- A user-friendly BottomNavigationView for seamless navigation within the app.

## Conclusion

TrackProgress stands as a robust and practical solution for employee management, combining secure login processes, efficient task assignment, leave management, and query resolution. The use of password hashing and the implementation of Room Database demonstrate advanced Android development expertise.

The provision of distinct portals for administrators and employees optimizes user roles and privileges, ensuring a smooth and tailored user experience. TrackProgress serves as a comprehensive example of Android development and user management that can be readily applied to real-world scenarios, making it a valuable resource in the realm of employee management solutions.
