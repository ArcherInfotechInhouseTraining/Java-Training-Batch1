
# Java-Training-Batch1

## Java NOV.23 Branch

### Overview
This repository contains Java training notes and lab programs. It covers essential concepts like data types, control structures, object-oriented programming (OOP), and advanced topics. The aim is to provide a solid understanding of Java programming through theory and hands-on examples.

### Table of Contents
1. [Basic Java Syntax](#basic-java-syntax)
2. [Data Types](#data-types)
3. [Operators](#operators)
4. [Control Structures](#control-structures)
5. [Functions and Methods](#functions-and-methods)
6. [Object-Oriented Programming](#object-oriented-programming)
7. [Arrays](#arrays)
8. [Exception Handling](#exception-handling)
9. [File I/O](#file-io)
10. [Wrapper Classes](#wrapper-classes)
11. [Example Programs](#example-programs)

---

### Basic Java Syntax
Java programs start with a class definition and a `main` method. For input/output, we typically use `System.in` and `System.out`.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");
    }
}
```

---

### Data Types
Java supports both **Primitive** and **Non-Primitive** data types. Below is a summary:

- **Primitive Data Types**:
  - Integer: `int`, `byte`, `short`, `long`
  - Floating-point: `float`, `double`
  - Character: `char`
  - Boolean: `boolean`

- **Non-Primitive Data Types**:
  - Arrays
  - Strings
  - Classes & Objects

Example:
```java
int num = 10;
float pi = 3.14f;
char grade = 'A';
```

---

### Operators
Java supports several operators to perform operations on variables and values.

- **Arithmetic Operators**: `+`, `-`, `*`, `/`, `%`
- **Relational Operators**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical Operators**: `&&`, `||`, `!`
- **Bitwise Operators**: `&`, `|`, `^`, `~`

---

### Control Structures
Java includes conditional statements and loops for controlling program flow.

- **Conditional Statements**:
  - `if`, `else`, `else if`, `switch`
  
- **Loops**:
  - `for`, `while`, `do-while`

Example `if-else`:
```java
if (num > 10) {
    System.out.println("Greater than 10");
} else {
    System.out.println("Less than or equal to 10");
}
```

---

### Functions and Methods
Functions in Java are written as methods within classes. Java supports:
- **Method Overloading**: Methods with the same name but different parameter lists.
- **Return Types**: Methods can return values or be `void`.

Example:
```java
public int addNumbers(int a, int b) {
    return a + b;
}
```

---

### Object-Oriented Programming
Java is object-oriented. Here are key concepts:
- **Class and Object**: Blueprint and instance.
- **Encapsulation**: Wrapping data and methods into a single unit.
- **Inheritance**: One class acquiring properties from another.
- **Polymorphism**: Objects can take many forms (method overloading and overriding).

Example class:
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

### Arrays
Arrays store multiple values of the same type.
- **1D Array**:
  ```java
  int[] arr = {10, 20, 30};
  ```

- **2D Array**:
  ```java
  int[][] matrix = {{1, 2}, {3, 4}};
  ```

---

### Exception Handling
In Java, exceptions are handled using `try-catch-finally` blocks. Exception handling prevents program crashes during runtime errors.
```java
try {
    int num = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("End of program");
}
```

---

### File I/O
Java provides the `java.io` package for file operations. Some common classes include:
- `FileInputStream`
- `FileOutputStream`
- `BufferedReader`
- `BufferedWriter`

Example reading a file:
```java
BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}
```

---

### Wrapper Classes
Wrapper classes provide a way to use primitive data types as objects. Java offers wrapper classes like `Integer`, `Double`, `Boolean`, etc.

Example:
```java
Integer num = 10;
System.out.println(num.toString());
```

---

### Example Programs
Here are a few examples of basic and advanced Java programs:
1. [Calculator using Switch Case](examples/Calculator.java)
2. [Array Input and Output](examples/ArrayInputOutput.java)
3. [Inheritance Example](examples/InheritanceDemo.java)
4. [File Reading Example](examples/FileReading.java)

---

### How to Contribute
Feel free to clone, fork, and submit pull requests to enhance the repository with more examples, explanations, or updates.
