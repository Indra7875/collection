### SOLID Principles Java
- In Java, SOLID principles are an object-oriented approach that are applied to software design.
- It is conceptualized by Robert C. Martin (also known as Uncle Bob)
- These five principles have changed the world of object-oriented programming, and also changed the way of writing pieces of software.
- It ensures that the software is modular, easy to understand, debug and refactor.
- SOLID Principles are :
   1) Single Responsibility Principle (SRP)
   2) Open-Closed Principle (OCP)
   3) Liskov Substitution Principle (LSP)
   4) Interface Segregation Principle (ISP)
   5) Dependency Inversion Principle (DIP)

**1) Single Responsibility Principle (SRP) :**
- The single responsibility principle states that every java class must perform a single functionality.
- Implementation of multiple functionalities in a single class mashup the code and if modification is required may affect the whole class.
- It precise the code and code can be easily maintained. <br>
**Example :**
- Suppose, Student is a class having methods namely printDetails(), calculatePercentage() and addStudent(). 
- Hence, the student class has three responsibilities to print the details of students, calculate percentage and add student in database.
- By using the single responsibility principle, we can separate these functionalities into three separate classes to fulfill the goal of the principle.

```
package programs.solid_principles.srp;

public class Student {
    public void printDetails(){
        // functionality of the method
    }
    
    public void calculatePercentage(){
        // functionality of the method
    }
    
    public void addStudent(){
        // functionality of the method
    }
}

```
