# **Teacher Management System**

The **Teacher Management System** is a Java-based application with an integrated **Graphical User Interface (GUI)** to manage teacher-related operations. It supports storing teacher data, managing lecturer grading, and handling tutor salary and certification processes using core **Object-Oriented Programming** principles in Java.

---

## **Features**

### General Teacher Management  
- Store and manage teacher details: **ID, name, address, working type, and employment status**  
- Display teacher information in a structured format  
- **User-friendly GUI** for adding, viewing, and editing teacher records  

### Lecturer Functionalities  
- Assign lecturers to **departments** and track **years of experience**  
- Allow only **qualified lecturers** to **grade assignments**  
- Display **grading results** and update lecturer status  
- GUI panel for assigning departments and grading operations  

### Tutor Functionalities  
- Manage tutor **specialization, academic qualifications, and salary details**  
- Implement **performance-based salary increments**  
- Certify tutors based on **performance index and working hours**  
- **Remove tutors** if they fail to meet certification criteria  
- GUI support for tutor operations such as salary update and removal  

---

## **File Structure**

```plaintext
├── Teacher.java              # Base class for all teachers
├── Lecturer.java             # Lecturer-specific functionality (grading, department)
├── Tutor.java                # Tutor-specific functionality (salary, certification)
└── TeacherManagementGUI.java # GUI interface using Swing
```
## **Technologies Used**
- Java – Core language for object-oriented logic
- Swing – GUI development
- Inheritance & Polymorphism – Class structure for teachers
- Encapsulation – Data protection with getters/setters
- Event-driven Programming – Handling user actions in GUI
