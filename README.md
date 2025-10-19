# Complete Java Programming Guide

## Table of Contents
1. Introduction to Java
2. Basic Syntax and Data Types
3. Operators
4. Control Flow Statements
5. Arrays
6. Object-Oriented Programming (OOP)
7. Inheritance and Polymorphism
8. Abstract Classes and Interfaces
9. Exception Handling
10. Collections Framework
11. Generics
12. Multithreading
13. File I/O
14. Lambda Expressions and Streams
15. Advanced Topics

---

## 1. Introduction to Java

Java is a high-level, object-oriented programming language developed by Sun Microsystems (now Oracle) in 1995. It follows the principle of "Write Once, Run Anywhere" (WORA), meaning compiled Java code can run on any platform that supports Java.

### Key Features:
- **Platform Independent**: Java bytecode runs on JVM
- **Object-Oriented**: Everything is an object in Java
- **Secure**: Built-in security features
- **Robust**: Strong memory management and exception handling
- **Multithreaded**: Supports concurrent programming

### Java Development Kit (JDK):
- **JDK**: Java Development Kit (includes compiler, debugger)
- **JRE**: Java Runtime Environment (includes JVM)
- **JVM**: Java Virtual Machine (executes bytecode)

---

## 2. Basic Syntax and Data Types

### First Java Program

```java
public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    
}
```

### Data Types

Java has two categories of data types:

#### Primitive Data Types

```java
public class DataTypesDemo {
    
    public static void main(String[] args) {
        
        // Integer types
        byte byteVar = 127;                    // 8-bit: -128 to 127
        short shortVar = 32000;                // 16-bit: -32,768 to 32,767
        int intVar = 2147483647;               // 32-bit: -2^31 to 2^31-1
        long longVar = 9223372036854775807L;   // 64-bit: -2^63 to 2^63-1
        
        // Floating-point types
        float floatVar = 3.14f;                // 32-bit IEEE 754
        double doubleVar = 3.14159265359;      // 64-bit IEEE 754
        
        // Character type
        char charVar = 'A';                    // 16-bit Unicode character
        
        // Boolean type
        boolean boolVar = true;                // true or false
        
        // Printing values
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + boolVar);
        
    }
    
}
```

#### Reference Data Types

```java
public class ReferenceTypesDemo {
    
    public static void main(String[] args) {
        
        // String (most commonly used reference type)
        String name = "John Doe";
        String greeting = new String("Hello");
        
        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Objects
        Person person = new Person("Alice", 25);
        
        System.out.println("Name: " + name);
        System.out.println("Greeting: " + greeting);
        System.out.println("First number: " + numbers[0]);
        System.out.println("Person: " + person.getName());
        
    }
    
}

class Person {
    
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
}
```

### Variables and Constants

```java
public class VariablesDemo {
    
    // Instance variable
    int instanceVar = 10;
    
    // Static variable (class variable)
    static int staticVar = 20;
    
    // Constant
    static final double PI = 3.14159;
    
    public static void main(String[] args) {
        
        // Local variable
        int localVar = 30;
        
        System.out.println("Local Variable: " + localVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Constant PI: " + PI);
        
        // Creating object to access instance variable
        VariablesDemo obj = new VariablesDemo();
        System.out.println("Instance Variable: " + obj.instanceVar);
        
    }
    
}
```

---

## 3. Operators

### Arithmetic Operators

```java
public class ArithmeticOperators {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        
        System.out.println("Addition: " + (a + b));           // 13
        System.out.println("Subtraction: " + (a - b));        // 7
        System.out.println("Multiplication: " + (a * b));     // 30
        System.out.println("Division: " + (a / b));           // 3
        System.out.println("Modulus: " + (a % b));            // 1
        
        // Increment and Decrement
        int x = 5;
        System.out.println("x++: " + (x++));                  // 5 (post-increment)
        System.out.println("x: " + x);                        // 6
        System.out.println("++x: " + (++x));                  // 7 (pre-increment)
        System.out.println("x--: " + (x--));                  // 7 (post-decrement)
        System.out.println("--x: " + (--x));                  // 5 (pre-decrement)
        
    }
    
}
```

### Relational Operators

```java
public class RelationalOperators {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        
        System.out.println("a == b: " + (a == b));            // false
        System.out.println("a != b: " + (a != b));            // true
        System.out.println("a > b: " + (a > b));              // false
        System.out.println("a < b: " + (a < b));              // true
        System.out.println("a >= b: " + (a >= b));            // false
        System.out.println("a <= b: " + (a <= b));            // true
        
    }
    
}
```

### Logical Operators

```java
public class LogicalOperators {
    
    public static void main(String[] args) {
        
        boolean x = true;
        boolean y = false;
        
        System.out.println("x && y: " + (x && y));            // false (AND)
        System.out.println("x || y: " + (x || y));            // true (OR)
        System.out.println("!x: " + (!x));                    // false (NOT)
        
        // Short-circuit evaluation
        int a = 10;
        int b = 0;
        
        if (b != 0 && a / b > 1) {
            System.out.println("This won't execute");
        } else {
            System.out.println("Short-circuit prevented division by zero");
        }
        
    }
    
}
```

### Bitwise Operators

```java
public class BitwiseOperators {
    
    public static void main(String[] args) {
        
        int a = 5;      // 0101 in binary
        int b = 3;      // 0011 in binary
        
        System.out.println("a & b: " + (a & b));              // 1 (0001)
        System.out.println("a | b: " + (a | b));              // 7 (0111)
        System.out.println("a ^ b: " + (a ^ b));              // 6 (0110)
        System.out.println("~a: " + (~a));                    // -6 (two's complement)
        System.out.println("a << 1: " + (a << 1));            // 10 (1010)
        System.out.println("a >> 1: " + (a >> 1));            // 2 (0010)
        System.out.println("a >>> 1: " + (a >>> 1));          // 2 (unsigned right shift)
        
    }
    
}
```

### Assignment Operators

```java
public class AssignmentOperators {
    
    public static void main(String[] args) {
        
        int a = 10;
        
        a += 5;     // a = a + 5
        System.out.println("a += 5: " + a);                   // 15
        
        a -= 3;     // a = a - 3
        System.out.println("a -= 3: " + a);                   // 12
        
        a *= 2;     // a = a * 2
        System.out.println("a *= 2: " + a);                   // 24
        
        a /= 4;     // a = a / 4
        System.out.println("a /= 4: " + a);                   // 6
        
        a %= 4;     // a = a % 4
        System.out.println("a %= 4: " + a);                   // 2
        
    }
    
}
```

### Ternary Operator

```java
public class TernaryOperator {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        
        // condition ? value_if_true : value_if_false
        int max = (a > b) ? a : b;
        
        System.out.println("Maximum: " + max);                // 20
        
        // Nested ternary
        int x = 5;
        String result = (x > 0) ? "Positive" : (x < 0) ? "Negative" : "Zero";
        System.out.println("Result: " + result);              // Positive
        
    }
    
}
```

---

## 4. Control Flow Statements

### If-Else Statement

```java
public class IfElseDemo {
    
    public static void main(String[] args) {
        
        int score = 85;
        
        // Simple if
        if (score >= 90) {
            System.out.println("Grade: A");
        }
        
        // If-else
        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        // If-else-if ladder
        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Good");
        } else if (score >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Below Average");
        }
        
        // Nested if
        if (score >= 60) {
            if (score >= 90) {
                System.out.println("Outstanding Performance");
            } else {
                System.out.println("Good Performance");
            }
        }
        
    }
    
}
```

### Switch Statement

```java
public class SwitchDemo {
    
    public static void main(String[] args) {
        
        int day = 3;
        String dayName;
        
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        
        System.out.println("Day: " + dayName);
        
        // Switch with String
        String month = "March";
        
        switch (month) {
            case "January":
            case "March":
            case "May":
                System.out.println("31 days");
                break;
            case "February":
                System.out.println("28 or 29 days");
                break;
            case "April":
            case "June":
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid month");
        }
        
    }
    
}
```

### For Loop

```java
public class ForLoopDemo {
    
    public static void main(String[] args) {
        
        // Basic for loop
        System.out.println("Numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // For loop with multiple variables
        System.out.println("\nMultiple variables:");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        
        // Enhanced for loop (for-each)
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("\nArray elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Nested for loop
        System.out.println("\nMultiplication table:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        
    }
    
}
```

### While Loop

```java
public class WhileLoopDemo {
    
    public static void main(String[] args) {
        
        // Basic while loop
        System.out.println("Count from 1 to 5:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
        // While loop with condition
        System.out.println("\nSum of numbers until > 100:");
        int sum = 0;
        int num = 1;
        while (sum <= 100) {
            sum += num;
            num++;
        }
        System.out.println("Sum: " + sum);
        
    }
    
}
```

### Do-While Loop

```java
public class DoWhileLoopDemo {
    
    public static void main(String[] args) {
        
        // Basic do-while loop
        System.out.println("Count from 1 to 5:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();
        
        // Do-while executes at least once
        System.out.println("\nExecutes at least once:");
        int j = 10;
        do {
            System.out.println("This runs even though j > 5");
        } while (j < 5);
        
    }
    
}
```

### Break and Continue

```java
public class BreakContinueDemo {
    
    public static void main(String[] args) {
        
        // Break statement
        System.out.println("Break example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;  // Exit loop when i equals 6
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Continue statement
        System.out.println("\nContinue example:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Labeled break
        System.out.println("\nLabeled break example:");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer;  // Break out of outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        
    }
    
}
```

---

## 5. Arrays

### One-Dimensional Arrays

```java
public class OneDimensionalArray {
    
    public static void main(String[] args) {
        
        // Declaration and initialization
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // Initialization with values
        int[] nums = {1, 2, 3, 4, 5};
        
        // Accessing elements
        System.out.println("First element: " + nums[0]);
        System.out.println("Array length: " + nums.length);
        
        // Traversing array
        System.out.println("\nAll elements:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        // Enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
    
}
```

### Multi-Dimensional Arrays

```java
public class MultiDimensionalArray {
    
    public static void main(String[] args) {
        
        // Two-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Accessing elements
        System.out.println("Element at [1][2]: " + matrix[1][2]);
        
        // Traversing 2D array
        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Jagged array (array of arrays with different lengths)
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];
        
        // Three-dimensional array
        int[][][] cube = new int[2][3][4];
        
        System.out.println("\nCube dimensions: " + cube.length + " x " 
                          + cube[0].length + " x " + cube[0][0].length);
        
    }
    
}
```

### Array Operations

```java
import java.util.Arrays;

public class ArrayOperations {
    
    public static void main(String[] args) {
        
        int[] numbers = {5, 2, 8, 1, 9, 3};
        
        // Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // Searching (binary search on sorted array)
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);
        
        // Copying arrays
        int[] copy1 = Arrays.copyOf(numbers, numbers.length);
        int[] copy2 = numbers.clone();
        
        System.out.println("Copy 1: " + Arrays.toString(copy1));
        System.out.println("Copy 2: " + Arrays.toString(copy2));
        
        // Filling array
        int[] filled = new int[5];
        Arrays.fill(filled, 10);
        System.out.println("Filled array: " + Arrays.toString(filled));
        
        // Comparing arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Arrays equal: " + isEqual);
        
        // Finding max and min
        int max = findMax(numbers);
        int min = findMin(numbers);
        System.out.println("Max: " + max + ", Min: " + min);
        
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
}
```

---

## 6. Object-Oriented Programming (OOP)

### Classes and Objects

```java
public class ClassAndObjectDemo {
    
    public static void main(String[] args) {
        
        // Creating objects
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2023);
        
        // Accessing object properties
        car1.displayInfo();
        car2.displayInfo();
        
        // Calling methods
        car1.start();
        car1.accelerate(50);
        car1.brake();
        
    }
    
}

class Car {
    
    // Instance variables (fields)
    private String brand;
    private String model;
    private int year;
    private int speed;
    
    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }
    
    // Methods
    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }
    
    public void accelerate(int increment) {
        speed += increment;
        System.out.println("Speed increased to: " + speed + " km/h");
    }
    
    public void brake() {
        speed = 0;
        System.out.println("Car stopped. Speed: " + speed + " km/h");
    }
    
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
    
}
```

### Encapsulation

```java
public class EncapsulationDemo {
    
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("123456", "John Doe");
        
        account.deposit(1000);
        account.withdraw(500);
        account.displayBalance();
        
        // Cannot access private fields directly
        // account.balance = 10000; // Error: balance has private access
        
    }
    
}

class BankAccount {
    
    // Private fields (data hiding)
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }
    
    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Setter method with validation
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.isEmpty()) {
            this.accountHolder = accountHolder;
        }
    }
    
    // Public methods to interact with private data
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }
    
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
    
}
```

### Constructors

```java
public class ConstructorDemo {
    
    public static void main(String[] args) {
        
        // Using default constructor
        Student student1 = new Student();
        student1.displayInfo();
        
        // Using parameterized constructor
        Student student2 = new Student("Alice", 20, "Computer Science");
        student2.displayInfo();
        
        // Using constructor with partial parameters
        Student student3 = new Student("Bob", 22);
        student3.displayInfo();
        
    }
    
}

class Student {
    
    private String name;
    private int age;
    private String major;
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.major = "Undeclared";
    }
    
    // Parameterized constructor
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    // Constructor overloading
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.major = "Undeclared";
    }
    
    // Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.major = other.major;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
}

// Child class (Subclass)
class Dog extends Animal {
    
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    public void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
    
}

class Cat extends Animal {
    
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    public void meow() {
        System.out.println(name + " is meowing: Meow! Meow!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
    
}
```

### Types of Inheritance

```java
public class InheritanceTypes {
    
    public static void main(String[] args) {
        
        // Single Inheritance
        Manager manager = new Manager("John", 50000, "IT");
        manager.displayInfo();
        
        System.out.println();
        
        // Multilevel Inheritance
        Puppy puppy = new Puppy("Max", 1, "Labrador", 5);
        puppy.play();
        
        System.out.println();
        
        // Hierarchical Inheritance
        Rectangle rect = new Rectangle(10, 20);
        Circle circle = new Circle(7);
        
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
        
    }
    
}

// Single Inheritance: Employee <- Manager
class Employee {
    
    protected String name;
    protected double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }
    
}

class Manager extends Employee {
    
    private String department;
    
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
    
}

// Multilevel Inheritance: Animal <- Dog <- Puppy
class DogParent extends Animal {
    
    private String breed;
    
    public DogParent(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
}

class Puppy extends DogParent {
    
    private int cuteness;
    
    public Puppy(String name, int age, String breed, int cuteness) {
        super(name, age, breed);
        this.cuteness = cuteness;
    }
    
    public void play() {
        System.out.println(name + " is playing with cuteness level: " + cuteness);
    }
    
}

// Hierarchical Inheritance: Shape <- Rectangle, Circle
class Shape {
    
    public double calculateArea() {
        return 0;
    }
    
}

class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
}

class Circle extends Shape {
    
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
}
```

### Polymorphism

```java
public class PolymorphismDemo {
    
    public static void main(String[] args) {
        
        // Compile-time Polymorphism (Method Overloading)
        MathOperations math = new MathOperations();
        System.out.println("Add 2 integers: " + math.add(5, 10));
        System.out.println("Add 3 integers: " + math.add(5, 10, 15));
        System.out.println("Add 2 doubles: " + math.add(5.5, 10.3));
        
        System.out.println();
        
        // Runtime Polymorphism (Method Overriding)
        AnimalBase animal;
        
        animal = new DogType();
        animal.makeSound();  // Calls Dog's makeSound()
        
        animal = new CatType();
        animal.makeSound();  // Calls Cat's makeSound()
        
        animal = new CowType();
        animal.makeSound();  // Calls Cow's makeSound()
        
        System.out.println();
        
        // Polymorphic array
        AnimalBase[] animals = {
            new DogType(),
            new CatType(),
            new CowType()
        };
        
        System.out.println("All animals making sound:");
        for (AnimalBase a : animals) {
            a.makeSound();
        }
        
    }
    
}

// Compile-time Polymorphism
class MathOperations {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
}

// Runtime Polymorphism
class AnimalBase {
    
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
}

class DogType extends AnimalBase {
    
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
    
}

class CatType extends AnimalBase {
    
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
    
}

class CowType extends AnimalBase {
    
    @Override
    public void makeSound() {
        System.out.println("Cow moos: Moo! Moo!");
    }
    
}
```

### Method Overriding

```java
public class MethodOverridingDemo {
    
    public static void main(String[] args) {
        
        Parent parent = new Parent();
        parent.display();
        parent.show();
        
        System.out.println();
        
        Child child = new Child();
        child.display();
        child.show();
        
        System.out.println();
        
        // Parent reference, Child object
        Parent poly = new Child();
        poly.display();  // Calls Child's display()
        poly.show();     // Calls Child's show()
        
    }
    
}

class Parent {
    
    public void display() {
        System.out.println("Display from Parent");
    }
    
    public void show() {
        System.out.println("Show from Parent");
    }
    
    // Final method cannot be overridden
    public final void finalMethod() {
        System.out.println("This is a final method");
    }
    
}

class Child extends Parent {
    
    @Override
    public void display() {
        System.out.println("Display from Child");
        super.display();  // Call parent's display()
    }
    
    @Override
    public void show() {
        System.out.println("Show from Child");
    }
    
    // Cannot override final method
    // public void finalMethod() { } // Compile error
    
}
```

### Super Keyword

```java
public class SuperKeywordDemo {
    
    public static void main(String[] args) {
        
        ChildClass child = new ChildClass(10, 20);
        child.display();
        child.printValues();
        
    }
    
}

class ParentClass {
    
    int x;
    
    public ParentClass(int x) {
        this.x = x;
        System.out.println("Parent constructor called");
    }
    
    public void display() {
        System.out.println("Display from Parent");
    }
    
}

class ChildClass extends ParentClass {
    
    int x;
    int y;
    
    public ChildClass(int x, int y) {
        super(x);  // Call parent constructor
        this.x = x + 10;
        this.y = y;
        System.out.println("Child constructor called");
    }
    
    @Override
    public void display() {
        super.display();  // Call parent's display()
        System.out.println("Display from Child");
    }
    
    public void printValues() {
        System.out.println("Child x: " + this.x);
        System.out.println("Parent x: " + super.x);
        System.out.println("Child y: " + this.y);
    }
    
}
```

---

## 8. Abstract Classes and Interfaces

### Abstract Classes

```java
public class AbstractClassDemo {
    
    public static void main(String[] args) {
        
        // Cannot instantiate abstract class
        // Vehicle vehicle = new Vehicle(); // Error
        
        Car car = new Car("Toyota", 4);
        car.start();
        car.displayInfo();
        car.stop();
        
        System.out.println();
        
        Motorcycle bike = new Motorcycle("Harley", 2);
        bike.start();
        bike.displayInfo();
        bike.stop();
        
    }
    
}

// Abstract class
abstract class Vehicle {
    
    protected String brand;
    protected int wheels;
    
    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
    
    // Abstract method (no implementation)
    public abstract void start();
    
    // Abstract method
    public abstract void stop();
    
    // Concrete method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Wheels: " + wheels);
    }
    
}

class Car extends Vehicle {
    
    public Car(String brand, int wheels) {
        super(brand, wheels);
    }
    
    @Override
    public void start() {
        System.out.println("Car is starting with key");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping with brakes");
    }
    
}

class Motorcycle extends Vehicle {
    
    public Motorcycle(String brand, int wheels) {
        super(brand, wheels);
    }
    
    @Override
    public void start() {
        System.out.println("Motorcycle is starting with kick");
    }
    
    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping");
    }
    
}
```

### Interfaces

```java
public class InterfaceDemo {
    
    public static void main(String[] args) {
        
        SmartPhone phone = new SmartPhone();
        phone.makeCall("123-456-7890");
        phone.sendMessage("Hello!");
        phone.connectToInternet();
        phone.takePicture();
        
        System.out.println();
        
        // Interface reference
        Callable callable = phone;
        callable.makeCall("987-654-3210");
        
        Messaging messaging = phone;
        messaging.sendMessage("Hi there!");
        
    }
    
}

// Interface 1
interface Callable {
    
    void makeCall(String number);
    void receiveCall(String number);
    
}

// Interface 2
interface Messaging {
    
    void sendMessage(String message);
    void receiveMessage(String message);
    
}

// Interface 3
interface Internet {
    
    void connectToInternet();
    void disconnectFromInternet();
    
}

// Implementing multiple interfaces
class SmartPhone implements Callable, Messaging, Internet {
    
    @Override
    public void makeCall(String number) {
        System.out.println("Calling: " + number);
    }
    
    @Override
    public void receiveCall(String number) {
        System.out.println("Receiving call from: " + number);
    }
    
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
    
    @Override
    public void receiveMessage(String message) {
        System.out.println("Message received: " + message);
    }
    
    @Override
    public void connectToInternet() {
        System.out.println("Connected to Internet");
    }
    
    @Override
    public void disconnectFromInternet() {
        System.out.println("Disconnected from Internet");
    }
    
    // Additional method
    public void takePicture() {
        System.out.println("Taking a picture");
    }
    
}
```

### Interface with Default and Static Methods

```java
public class InterfaceDefaultStaticDemo {
    
    public static void main(String[] args) {
        
        MyClass obj = new MyClass();
        obj.abstractMethod();
        obj.defaultMethod();
        
        // Calling static method
        MyInterface.staticMethod();
        
    }
    
}

interface MyInterface {
    
    // Abstract method
    void abstractMethod();
    
    // Default method (Java 8+)
    default void defaultMethod() {
        System.out.println("Default method in interface");
        privateHelperMethod();
    }
    
    // Static method (Java 8+)
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
    
    // Private method (Java 9+)
    private void privateHelperMethod() {
        System.out.println("Private helper method");
    }
    
}

class MyClass implements MyInterface {
    
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation");
    }
    
    // Can override default method
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method");
    }
    
}
```

### Abstract Class vs Interface

```java
public class AbstractVsInterfaceDemo {
    
    public static void main(String[] args) {
        
        Button button = new Button();
        button.click();
        button.render();
        
    }
    
}

// Abstract class: Can have state, constructors, concrete methods
abstract class UIComponent {
    
    protected String id;
    protected int x, y;
    
    public UIComponent(String id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    
    // Abstract method
    public abstract void render();
    
    // Concrete method
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}

// Interface: Only method signatures (and default/static methods)
interface Clickable {
    
    void click();
    
    default void doubleClick() {
        System.out.println("Double clicked");
    }
    
}

// Class can extend one abstract class and implement multiple interfaces
class Button extends UIComponent implements Clickable {
    
    public Button() {
        super("btn1", 0, 0);
    }
    
    @Override
    public void render() {
        System.out.println("Rendering button at (" + x + ", " + y + ")");
    }
    
    @Override
    public void click() {
        System.out.println("Button clicked");
    }
    
}
```

---

## 9. Exception Handling

### Try-Catch Block

```java
public class TryCatchDemo {
    
    public static void main(String[] args) {
        
        // Basic try-catch
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        
        System.out.println();
        
        // Multiple catch blocks
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println();
        
        // Catching multiple exceptions (Java 7+)
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Error occurred: " + e.getClass().getSimpleName());
        }
        
    }
    
}
```

### Try-Catch-Finally

```java
public class TryCatchFinallyDemo {
    
    public static void main(String[] args) {
        
        // Finally block always executes
        try {
            System.out.println("Inside try block");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block - always executes");
        }
        
        System.out.println();
        
        // Finally executes even with exception
        try {
            System.out.println("Inside try block");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Finally executes even after exception");
        }
        
        System.out.println();
        
        // Finally executes even with return
        System.out.println("Return value: " + testFinally());
        
    }
    
    public static int testFinally() {
        try {
            return 10;
        } finally {
            System.out.println("Finally executes even before return");
        }
    }
    
}
```

### Throw and Throws

```java
public class ThrowThrowsDemo {
    
    public static void main(String[] args) {
        
        // Using throw keyword
        try {
            validateAge(15);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println();
        
        // Using throws keyword
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        
        System.out.println();
        
        // Checked exception with throws
        try {
            readFile("nonexistent.txt");
        } catch (Exception e) {
            System.out.println("File error: " + e.getMessage());
        }
        
    }
    
    // Method using throw
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Age is valid: " + age);
    }
    
    // Method using throws
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
    
    // Checked exception with throws
    public static void readFile(String filename) throws Exception {
        throw new Exception("File not found: " + filename);
    }
    
}
```

### Custom Exceptions

```java
public class CustomExceptionDemo {
    
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1000);
        
        try {
            account.withdraw(500);
            System.out.println("Withdrawal successful");
            
            account.withdraw(700);  // This will throw exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Deficit: $" + e.getDeficit());
        }
        
        System.out.println();
        
        try {
            account.withdraw(-100);  // Invalid amount
        } catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
    }
    
}

// Custom checked exception
class InsufficientFundsException extends Exception {
    
    private double deficit;
    
    public InsufficientFundsException(double deficit) {
        super("Insufficient funds in account");
        this.deficit = deficit;
    }
    
    public double getDeficit() {
        return deficit;
    }
    
}

// Custom unchecked exception
class InvalidAmountException extends RuntimeException {
    
    public InvalidAmountException(String message) {
        super(message);
    }
    
}

class BankAccount {
    
    private double balance;
    
    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new InvalidAmountException("Amount cannot be negative");
        }
        
        if (amount > balance) {
            double deficit = amount - balance;
            throw new InsufficientFundsException(deficit);
        }
        
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
        System.out.println("Remaining balance: $" + balance);
    }
    
}
```

### Try-with-Resources

```java
import java.io.*;

public class TryWithResourcesDemo {
    
    public static void main(String[] args) {
        
        // Try-with-resources (Java 7+)
        // Automatically closes resources
        try (BufferedReader reader = new BufferedReader(
                new StringReader("Line 1\nLine 2\nLine 3"))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
        // No need to explicitly close reader
        
        System.out.println();
        
        // Multiple resources
        String data = "Hello, World!";
        try (ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
             ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            
            int byteData;
            while ((byteData = input.read()) != -1) {
                output.write(byteData);
            }
            
            System.out.println("Data copied: " + output.toString());
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
```

---

## 10. Collections Framework

### ArrayList

```java
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        
        // Creating ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        
        System.out.println("Fruits: " + fruits);
        
        // Adding at specific index
        fruits.add(1, "Grapes");
        System.out.println("After adding Grapes: " + fruits);
        
        // Accessing elements
        System.out.println("Element at index 2: " + fruits.get(2));
        
        // Modifying elements
        fruits.set(0, "Pineapple");
        System.out.println("After modification: " + fruits);
        
        // Removing elements
        fruits.remove("Banana");
        fruits.remove(0);
        System.out.println("After removal: " + fruits);
        
        // Size and isEmpty
        System.out.println("Size: " + fruits.size());
        System.out.println("Is empty: " + fruits.isEmpty());
        
        // Contains
        System.out.println("Contains Orange: " + fruits.contains("Orange"));
        
        // Iterating
        System.out.println("\nIterating using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Sorting
        Collections.sort(fruits);
        System.out.println("\nSorted: " + fruits);
        
        // Clearing
        fruits.clear();
        System.out.println("After clear: " + fruits);
        
    }
    
}
```

### LinkedList

```java
import java.util.LinkedList;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> numbers = new LinkedList<>();
        
        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        // Adding at first and last
        numbers.addFirst(5);
        numbers.addLast(40);
        
        System.out.println("LinkedList: " + numbers);
        
        // Accessing first and last
        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Last element: " + numbers.getLast());
        
        // Removing first and last
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing first and last: " + numbers);
        
        // Peek, Poll, Offer (Queue operations)
        System.out.println("Peek: " + numbers.peek());
        System.out.println("Poll: " + numbers.poll());
        numbers.offer(50);
        System.out.println("After offer: " + numbers);
        
    }
    
}
```

### HashMap

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    
    public static void main(String[] args) {
        
        // Creating HashMap
        HashMap<String, Integer> scores = new HashMap<>();
        
        // Adding key-value pairs
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        scores.put("David", 78);
        
        System.out.println("Scores: " + scores);
        
        // Accessing value by key
        System.out.println("Alice's score: " + scores.get("Alice"));
        
        // Checking if key exists
        System.out.println("Contains Bob: " + scores.containsKey("Bob"));
        System.out.println("Contains score 95: " + scores.containsValue(95));
        
        // Updating value
        scores.put("Alice", 98);  // Updates existing key
        System.out.println("Updated scores: " + scores);
        
        // putIfAbsent
        scores.putIfAbsent("Eve", 85);
        scores.putIfAbsent("Alice", 100);  // Won't update
        System.out.println("After putIfAbsent: " + scores);
        
        // Removing entry
        scores.remove("David");
        System.out.println("After removal: " + scores);
        
        // Iterating using entrySet
        System.out.println("\nIterating through entries:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Iterating using keySet
        System.out.println("\nIterating through keys:");
        for (String key : scores.keySet()) {
            System.out.println(key + ": " + scores.get(key));
        }
        
        // Iterating using values
        System.out.println("\nAll scores:");
        for (Integer score : scores.values()) {
            System.out.println(score);
        }
        
        // Size and clear
        System.out.println("\nSize: " + scores.size());
        
    }
    
}
```

### HashSet

```java
import java.util.HashSet;

public class HashSetDemo {
    
    public static void main(String[] args) {
        
        // Creating HashSet
        HashSet<String> set = new HashSet<>();
        
        // Adding elements
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        
        System.out.println("Set: " + set);
        
        // Adding duplicate (ignored)
        set.add("Java");
        System.out.println("After adding duplicate: " + set);
        
        // Checking if element exists
        System.out.println("Contains Python: " + set.contains("Python"));
        
        // Removing element
        set.remove("C++");
        System.out.println("After removal: " + set);
        
        // Size and isEmpty
        System.out.println("Size: " + set.size());
        System.out.println("Is empty: " + set.isEmpty());
        
        // Iterating
        System.out.println("\nIterating:");
        for (String language : set) {
            System.out.println(language);
        }
        
        // Set operations
        HashSet<String> set2 = new HashSet<>();
        set2.add("Java");
        set2.add("Ruby");
        set2.add("Go");
        
        // Union
        HashSet<String> union = new HashSet<>(set);
        union.addAll(set2);
        System.out.println("\nUnion: " + union);
        
        // Intersection
        HashSet<String> intersection = new HashSet<>(set);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        
        // Difference
        HashSet<String> difference = new HashSet<>(set);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);
        
    }
    
}
```

### TreeMap and TreeSet

```java
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeCollectionsDemo {
    
    public static void main(String[] args) {
        
        // TreeSet - Sorted Set
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(30);
        
        System.out.println("TreeSet (sorted): " + numbers);
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println("Lower than 50: " + numbers.lower(50));
        System.out.println("Higher than 50: " + numbers.higher(50));
        
        System.out.println();
        
        // TreeMap - Sorted Map
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Zebra", 3);
        map.put("Apple", 1);
        map.put("Mango", 2);
        map.put("Banana", 4);
        
        System.out.println("TreeMap (sorted by keys): " + map);
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("Lower key than Mango: " + map.lowerKey("Mango"));
        System.out.println("Higher key than Mango: " + map.higherKey("Mango"));
        
    }
    
}
```

### Queue and Deque

```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDequeDemo {
    
    public static void main(String[] args) {
        
        // Queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        
        // Adding elements
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        
        System.out.println("Queue: " + queue);
        
        // Peek (view without removing)
        System.out.println("Peek: " + queue.peek());
        
        // Poll (remove and return)
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);
        
        System.out.println();
        
        // PriorityQueue (natural ordering)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);
        
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Polling elements in order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
        
        System.out.println();
        
        // Deque (Double-ended queue)
        Deque<String> deque = new ArrayDeque<>();
        
        // Adding at both ends
        deque.offerFirst("First");
        deque.offerLast("Last");
        deque.offerFirst("New First");
        deque.offerLast("New Last");
        
        System.out.println("Deque: " + deque);
        
        // Removing from both ends
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());
        System.out.println("After polls: " + deque);
        
    }
    
}
```

### Iterator and ListIterator

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        
        // Iterator (forward only)
        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            
            // Remove element during iteration
            if (element.equals("Banana")) {
                iterator.remove();
            }
        }
        
        System.out.println("After removal: " + list);
        
        System.out.println();
        
        // ListIterator (bidirectional)
        System.out.println("Using ListIterator (forward):");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String element = listIterator.next();
            System.out.println(index + ": " + element);
        }
        
        System.out.println("\nUsing ListIterator (backward):");
        while (listIterator.hasPrevious()) {
            int index = listIterator.previousIndex();
            String element = listIterator.previous();
            System.out.println(index + ": " + element);
        }
        
        // Modifying during iteration
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals("Cherry")) {
                listIterator.set("Mango");  // Replace
            }
        }
        
        System.out.println("\nAfter modification: " + list);
        
    }
    
}
```

---

## 11. Generics

### Generic Classes

```java
public class GenericClassDemo {
    
    public static void main(String[] args) {
        
        // Generic class with Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer Box: " + intBox.get());
        
        // Generic class with String
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String Box: " + strBox.get());
        
        // Generic class with custom object
        Box<Person> personBox = new Box<>();
        personBox.set(new Person("Alice", 25));
        System.out.println("Person Box: " + personBox.get().getName());
        
        System.out.println();
        
        // Pair class with two type parameters
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
        
    }
    
}

// Generic class with single type parameter
class Box<T> {
    
    private T value;
    
    public void set(T value) {
        this.value = value;
    }
    
    public T get() {
        return value;
    }
    
}

// Generic class with multiple type parameters
class Pair<K, V> {
    
    private K key;
    private V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
    
}

class Person {
    
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
}
```

### Generic Methods

```java
public class GenericMethodDemo {
    
    public static void main(String[] args) {
        
        // Generic method with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);
        
        // Generic method with String array
        String[] strArray = {"Hello", "World", "Generics"};
        printArray(strArray);
        
        // Generic method with Double array
        Double[] doubleArray = {1.1, 2.2, 3.3};
        printArray(doubleArray);
        
        System.out.println();
        
        // Generic method returning value
        Integer maxInt = getMax(10, 20, 5);
        System.out.println("Max Integer: " + maxInt);
        
        String maxStr = getMax("Apple", "Banana", "Cherry");
        System.out.println("Max String: " + maxStr);
        
        System.out.println();
        
        // Generic method with bounded type parameter
        System.out.println("Sum: " + sum(10, 20, 30));
        System.out.println("Sum: " + sum(1.5, 2.5, 3.5));
        
    }
    
    // Generic method to print array
    public static <T> void printArray(T[] array) {
        System.out.print("Array: ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    // Generic method returning value
    public static <T extends Comparable<T>> T getMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    
    // Generic method with bounded type (only Number and its subclasses)
    public static <T extends Number> double sum(T a, T b, T c) {
        return a.doubleValue() + b.doubleValue() + c.doubleValue();
    }
    
}
```

### Bounded Type Parameters

```java
public class BoundedTypeDemo {
    
    public static void main(String[] args) {
        
        // Upper bounded
        NumberBox<Integer> intBox = new NumberBox<>(100);
        NumberBox<Double> doubleBox = new NumberBox<>(50.5);
        
        System.out.println("Integer doubled: " + intBox.doubleValue());
        System.out.println("Double doubled: " + doubleBox.doubleValue());
        
        System.out.println();
        
        // Multiple bounds
        DataProcessor<String> processor = new DataProcessor<>();
        processor.process("Hello");
        
    }
    
}

// Upper bounded type parameter (extends Number)
class NumberBox<T extends Number> {
    
    private T value;
    
    public NumberBox(T value) {
        this.value = value;
    }
    
    public double doubleValue() {
        return value.doubleValue() * 2;
    }
    
}

// Multiple bounds (extends class and implements interfaces)
class DataProcessor<T extends Comparable<T> & CharSequence> {
    
    public void process(T data) {
        System.out.println("Processing: " + data);
        System.out.println("Length: " + data.length());
    }
    
}
```

### Wildcards

```java
import java.util.ArrayList;
import java.util.List;

public class WildcardsDemo {
    
    public static void main(String[] args) {
        
        // Unbounded wildcard
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        
        printList(intList);
        
        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        
        printList(strList);
        
        System.out.println();
        
        // Upper bounded wildcard
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(20);
        
        List<Double> numbers2 = new ArrayList<>();
        numbers2.add(1.5);
        numbers2.add(2.5);
        
        System.out.println("Sum: " + sumOfList(numbers1));
        System.out.println("Sum: " + sumOfList(numbers2));
        
        System.out.println();
        
        // Lower bounded wildcard
        List<Integer> intList2 = new ArrayList<>();
        addNumbers(intList2);
        System.out.println("List after adding: " + intList2);
        
    }
    
    // Unbounded wildcard (?)
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    // Upper bounded wildcard (? extends Type)
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
    
    // Lower bounded wildcard (? super Type)
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }
    
}
```

---

## 12. Multithreading

### Creating Threads

```java
public class ThreadCreationDemo {
    
    public static void main(String[] args) {
        
        System.out.println("Main thread: " + Thread.currentThread().getName());
        
        // Method 1: Extending Thread class
        MyThread thread1 = new MyThread("Thread-1");
        thread1.start();
        
        MyThread thread2 = new MyThread("Thread-2");
        thread2.start();
        
        // Method 2: Implementing Runnable interface
        Thread thread3 = new Thread(new MyRunnable("Thread-3"));
        thread3.start();
        
        Thread thread4 = new Thread(new MyRunnable("Thread-4"));
        thread4.start();
        
        // Method 3: Using lambda expression
        Thread thread5 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Thread: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread5.start();
        
        System.out.println("Main thread ending");
        
    }
    
}

// Method 1: Extending Thread class
class MyThread extends Thread {
    
    private String threadName;
    
    public MyThread(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}

// Method 2: Implementing Runnable interface
class MyRunnable implements Runnable {
    
    private String threadName;
    
    public MyRunnable(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
```

### Thread Lifecycle and Methods

```java
public class ThreadLifecycleDemo {
    
    public static void main(String[] args) {
        
        Thread thread = new Thread(() -> {
            System.out.println("Thread started");
            
            for (int i = 1; i <= 5; i++) {
                System.out.println("Count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                    return;
                }
            }
            
            System.out.println("Thread finished");
        });
        
        // Thread states
        System.out.println("State: " + thread.getState());  // NEW
        
        thread.start();
        System.out.println("State: " + thread.getState());  // RUNNABLE
        
        // Thread properties
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Is Alive: " + thread.isAlive());
        System.out.println("Is Daemon: " + thread.isDaemon());
        
        // Wait for thread to complete
        try {
            thread.join();  // Main thread waits for this thread
            System.out.println("State after join: " + thread.getState());  // TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread ending");
        
    }
    
}
```

### Synchronization

```java
public class SynchronizationDemo {
    
    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        // Creating multiple threads that increment the same counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final count: " + counter.getCount());
        
    }
    
}

class Counter {
    
    private int count = 0;
    
    // Synchronized method
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
    
}
```

### Synchronized Block and Static Synchronization

```java
public class SynchronizedBlockDemo {
    
    public static void main(String[] args) {
        
        Printer printer = new Printer();
        
        Thread t1 = new Thread(() -> {
            printer.printDocuments("Thread-1");
        });
        
        Thread t2 = new Thread(() -> {
            printer.printDocuments("Thread-2");
        });
        
        t1.start();
        t2.start();
        
        // Static synchronization
        Thread t3 = new Thread(() -> {
            StaticPrinter.print("Static Thread-1");
        });
        
        Thread t4 = new Thread(() -> {
            StaticPrinter.print("Static Thread-2");
        });
        
        t3.start();
        t4.start();
        
    }
    
}

class Printer {
    
    // Synchronized block
    public void printDocuments(String threadName) {
        synchronized(this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " printing document " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}

class StaticPrinter {
    
    // Static synchronized method
    public static synchronized void print(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
```

### Inter-thread Communication

```java
public class InterThreadCommunicationDemo {
    
    public static void main(String[] args) {
        
        SharedResource resource = new SharedResource();
        
        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.produce(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.consume();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        producer.start();
        consumer.start();
        
    }
    
}

class SharedResource {
    
    private int data;
    private boolean hasData = false;
    
    // Producer method
    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait();  // Wait if data is already present
        }
        
        this.data = value;
        System.out.println("Produced: " + value);
        hasData = true;
        notify();  // Notify consumer
    }
    
    // Consumer method
    public synchronized void consume() throws InterruptedException {
        while (!hasData) {
            wait();  // Wait if no data is present
        }
        
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();  // Notify producer
    }
    
}
```

### Deadlock Example

```java
public class DeadlockDemo {
    
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2");
                }
            }
        });
        
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2");
                }
            }
        });
        
        thread1.start();
        thread2.start();
        
        // This will cause a deadlock
        
    }
    
}
```

---

## 13. File I/O

### File Operations

```java
import java.io.File;
import java.io.IOException;

public class FileOperationsDemo {
    
    public static void main(String[] args) {
        
        try {
            // Creating a file
            File file = new File("example.txt");
            
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
            
            // File information
            System.out.println("\nFile Information:");
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Name: " + file.getName());
            System.out.println("Parent: " + file.getParent());
            System.out.println("Path: " + file.getPath());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Exists: " + file.exists());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Length: " + file.length() + " bytes");
            
            // Creating directory
            File dir = new File("testDirectory");
            if (dir.mkdir()) {
                System.out.println("\nDirectory created: " + dir.getName());
            }
            
            // Listing files in directory
            File currentDir = new File(".");
            String[] files = currentDir.list();
            System.out.println("\nFiles in current directory:");
            if (files != null) {
                for (String fileName : files) {
                    System.out.println(fileName);
                }
            }
            
            // Renaming file
            File newFile = new File("renamed_example.txt");
            if (file.renameTo(newFile)) {
                System.out.println("\nFile renamed successfully");
            }
            
            // Deleting file
            if (newFile.delete()) {
                System.out.println("File deleted successfully");
            }
            
            // Deleting directory
            if (dir.delete()) {
                System.out.println("Directory deleted successfully");
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
```

### Reading and Writing Files

```java
import java.io.*;

public class FileReadWriteDemo {
    
    public static void main(String[] args) {
        
        String filename = "data.txt";
        
        // Writing to file using FileWriter
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, World!\n");
            writer.write("This is a test file.\n");
            writer.write("Java File I/O is easy!\n");
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Reading from file using FileReader
        System.out.println("\nReading file using FileReader:");
        try (FileReader reader = new FileReader(filename)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        // Writing using BufferedWriter
        System.out.println("\n\nWriting using BufferedWriter:");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"))) {
            bw.write("Line 1");
            bw.newLine();
            bw.write("Line 2");
            bw.newLine();
            bw.write("Line 3");
            System.out.println("Successfully wrote using BufferedWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Reading using BufferedReader
        System.out.println("\nReading using BufferedReader:");
        try (BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
```

### Binary File I/O

```java
import java.io.*;

public class BinaryFileIODemo {
    
    public static void main(String[] args) {
        
        String filename = "binary_data.dat";
        
        // Writing binary data
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(filename))) {
            
            dos.writeInt(100);
            dos.writeDouble(3.14159);
            dos.writeBoolean(true);
            dos.writeUTF("Hello Binary");
            
            System.out.println("Binary data written successfully");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Reading binary data
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(filename))) {
            
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean boolValue = dis.readBoolean();
            String strValue = dis.readUTF();
            
            System.out.println("\nBinary data read:");
            System.out.println("Int: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Boolean: " + boolValue);
            System.out.println("String: " + strValue);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
```

### Serialization

```java
import java.io.*;

public class SerializationDemo {
    
    public static void main(String[] args) {
        
        String filename = "student.ser";
        
        // Creating student object
        StudentData student = new StudentData("Alice", 20, "Computer Science");
        
        // Serialization (Writing object to file)
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            
            oos.writeObject(student);
            System.out.println("Object serialized successfully");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Deserialization (Reading object from file)
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            
            StudentData deserializedStudent = (StudentData) ois.readObject();
            System.out.println("\nObject deserialized successfully:");
            deserializedStudent.displayInfo();
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}

// Class must implement Serializable interface
class StudentData implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String name;
    private int age;
    private String major;
    
    // transient keyword prevents serialization of this field
    private transient String password = "secret";
    
    public StudentData(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println("Password: " + password);  // Will be null after deserialization
    }
    
}
```

---

## 14. Lambda Expressions and Streams

### Lambda Expressions

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpressionsDemo {
    
    public static void main(String[] args) {
        
        // Lambda with no parameters
        Runnable runnable = () -> System.out.println("Hello from Lambda!");
        runnable.run();
        
        // Lambda with single parameter
        MyFunctionalInterface greeting = (name) -> System.out.println("Hello, " + name);
        greeting.greet("Alice");
        
        // Lambda with multiple parameters
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        
        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Multiplication: " + multiply.calculate(10, 5));
        
        // Lambda with block body
        Calculator divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
            return a / b;
        };
        
        System.out.println("Division: " + divide.calculate(10, 2));
        
        // Lambda for sorting
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println("\nOriginal list: " + names);
        
        // Sorting using lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list: " + names);
        
        // Reverse sorting
        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Reverse sorted: " + names);
        
    }
    
}

// Functional Interface
@FunctionalInterface
interface MyFunctionalInterface {
    void greet(String name);
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

### Method References

```java
import java.util.ArrayList;
import java.util.function.*;

public class MethodReferencesDemo {
    
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Method reference to static method
        names.forEach(MethodReferencesDemo::printUpperCase);
        
        System.out.println();
        
        // Method reference to instance method
        MethodReferencesDemo demo = new MethodReferencesDemo();
        names.forEach(demo::printLowerCase);
        
        System.out.println();
        
        // Method reference to instance method of arbitrary object
        names.forEach(String::toUpperCase);  // Doesn't print, just demonstrates syntax
        
        // Constructor reference
        Function<String, StringBuilder> sbCreator = StringBuilder::new;
        StringBuilder sb = sbCreator.apply("Hello");
        System.out.println("StringBuilder: " + sb);
        
        // Array constructor reference
        IntFunction<int[]> arrayCreator = int[]::new;
        int[] array = arrayCreator.apply(5);
        System.out.println("Array length: " + array.length);
        
    }
    
    // Static method
    public static void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
    
    // Instance method
    public void printLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }
    
}
```

### Functional Interfaces

```java
import java.util.function.*;

public class FunctionalInterfacesDemo {
    
    public static void main(String[] args) {
        
        // Predicate - takes one argument, returns boolean
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 7 even? " + isEven.test(7));
        
        // Function - takes one argument, returns a result
        Function<String, Integer> stringLength = (s) -> s.length();
        System.out.println("\nLength of 'Hello': " + stringLength.apply("Hello"));
        
        // Consumer - takes one argument, returns nothing
        Consumer<String> printer = (s) -> System.out.println("Message: " + s);
        printer.accept("Hello, World!");
        
        // Supplier - takes no arguments, returns a result
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("\nRandom value: " + randomValue.get());
        
        // BiPredicate - takes two arguments, returns boolean
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println("\nIs 10 > 5? " + isGreater.test(10, 5));
        
        // BiFunction - takes two arguments, returns a result
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("10 + 5 = " + add.apply(10, 5));
        
        // BiConsumer - takes two arguments, returns nothing
        BiConsumer<String, Integer> printInfo = (name, age) -> 
            System.out.println(name + " is " + age + " years old");
        printInfo.accept("Alice", 25);
        
        // UnaryOperator - takes one argument of type T, returns result of type T
        UnaryOperator<Integer> square = (n) -> n * n;
        System.out.println("\nSquare of 5: " + square.apply(5));
        
        // BinaryOperator - takes two arguments of type T, returns result of type T
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("5 * 3 = " + multiply.apply(5, 3));
        
    }
    
}
```

### Stream API

```java
import java.util.*;
import java.util.stream.*;

public class StreamAPIDemo {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filter - keep only even numbers
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
        
        // Map - square each number
        System.out.println("\nSquared numbers:");
        List<Integer> squared = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());
        System.out.println(squared);
        
        // Sorted
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        System.out.println("\nSorted names:");
        names.stream()
             .sorted()
             .forEach(System.out::println);
        
        // Distinct
        List<Integer> duplicates = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);
        System.out.println("\nDistinct numbers:");
        duplicates.stream()
                  .distinct()
                  .forEach(System.out::println);
        
        // Limit and Skip
        System.out.println("\nFirst 3 numbers:");
        numbers.stream()
               .limit(3)
               .forEach(System.out::println);
        
        System.out.println("\nSkip first 5 numbers:");
        numbers.stream()
               .skip(5)
               .forEach(System.out::println);
        
        // Count
        long count = numbers.stream()
                           .filter(n -> n > 5)
                           .count();
        System.out.println("\nCount of numbers > 5: " + count);
        
        // Sum, Average, Max, Min
        int sum = numbers.stream()
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println("\nSum: " + sum);
        
        OptionalDouble average = numbers.stream()
                                       .mapToInt(Integer::intValue)
                                       .average();
        System.out.println("Average: " + average.orElse(0.0));
        
        Optional<Integer> max = numbers.stream()
                                      .max(Integer::compareTo);
        System.out.println("Max: " + max.orElse(0));
        
        Optional<Integer> min = numbers.stream()
                                      .min(Integer::compareTo);
        System.out.println("Min: " + min.orElse(0));
        
        // Reduce
        Optional<Integer> product = numbers.stream()
                                          .reduce((a, b) -> a * b);
        System.out.println("\nProduct: " + product.orElse(0));
        
        // Collect to different collections
        Set<Integer> numberSet = numbers.stream()
                                       .collect(Collectors.toSet());
        System.out.println("\nSet: " + numberSet);
        
        // AnyMatch, AllMatch, NoneMatch
        boolean anyGreaterThan5 = numbers.stream()
                                        .anyMatch(n -> n > 5);
        System.out.println("\nAny number > 5? " + anyGreaterThan5);
        
        boolean allPositive = numbers.stream()
                                    .allMatch(n -> n > 0);
        System.out.println("All positive? " + allPositive);
        
        boolean noneNegative = numbers.stream()
                                     .noneMatch(n -> n < 0);
        System.out.println("None negative? " + noneNegative);
        
    }
    
}
```

### Advanced Stream Operations

```java
import java.util.*;
import java.util.stream.*;

public class AdvancedStreamDemo {
    
    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 50000, "IT"),
            new Employee("Bob", 25, 45000, "HR"),
            new Employee("Charlie", 35, 60000, "IT"),
            new Employee("David", 28, 48000, "Finance"),
            new Employee("Eve", 32, 55000, "IT"),
            new Employee("Frank", 40, 70000, "HR")
        );
        
        // Filter and Map
        System.out.println("IT Department Employees:");
        employees.stream()
                 .filter(e -> e.getDepartment().equals("IT"))
                 .map(Employee::getName)
                 .forEach(System.out::println);
        
        // GroupBy
        System.out.println("\nEmployees by Department:");
        Map<String, List<Employee>> byDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));
        
        byDepartment.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList.size() + " employees");
        });
        
        // Average salary by department
        System.out.println("\nAverage Salary by Department:");
        Map<String, Double> avgSalary = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));
        
        avgSalary.forEach((dept, avg) -> {
            System.out.println(dept + ": $" + avg);
        });
        
        // Partitioning (like grouping but with boolean)
        System.out.println("\nEmployees partitioned by salary > 50000:");
        Map<Boolean, List<Employee>> partitioned = employees.stream()
            .collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));
        
        System.out.println("High earners: " + partitioned.get(true).size());
        System.out.println("Others: " + partitioned.get(false).size());
        
        // Parallel Stream
        System.out.println("\nParallel stream processing:");
        long startTime = System.currentTimeMillis();
        
        List<Integer> largeList = IntStream.rangeClosed(1, 1000000)
                                          .boxed()
                                          .collect(Collectors.toList());
        
        int sum = largeList.parallelStream()
                          .mapToInt(Integer::intValue)
                          .sum();
        
        long endTime = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        
        // FlatMap
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        
        System.out.println("\nFlattened list:");
        List<Integer> flattened = listOfLists.stream()
                                             .flatMap(List::stream)
                                             .collect(Collectors.toList());
        System.out.println(flattened);
        
    }
    
}

class Employee {
    
    private String name;
    private int age;
    private double salary;
    private String department;
    
    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String getDepartment() {
        return department;
    }
    
}
```

---

## 15. Advanced Topics

### Enumerations (Enums)

```java
public class EnumDemo {
    
    public static void main(String[] args) {
        
        // Using enum
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
        
        // Enum with switch
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week");
                break;
            case FRIDAY:
                System.out.println("End of the work week");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day");
        }
        
        // Iterating over enum values
        System.out.println("\nAll days:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
        
        // Enum with fields and methods
        Pizza myPizza = new Pizza(Size.LARGE);
        System.out.println("\nPizza size: " + myPizza.getSize());
        System.out.println("Price: $" + myPizza.getSize().getPrice());
        
        // Enum ordinal and name
        System.out.println("\nOrdinal of WEDNESDAY: " + Day.WEDNESDAY.ordinal());
        System.out.println("Name of WEDNESDAY: " + Day.WEDNESDAY.name());
        
    }
    
}

// Simple enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Enum with fields, constructor, and methods
enum Size {
    
    SMALL(8.99),
    MEDIUM(10.99),
    LARGE(12.99),
    EXTRA_LARGE(14.99);
    
    private final double price;
    
    // Constructor
    Size(double price) {
        this.price = price;
    }
    
    // Method
    public double getPrice() {
        return price;
    }
    
}

class Pizza {
    
    private Size size;
    
    public Pizza(Size size) {
        this.size = size;
    }
    
    public Size getSize() {
        return size;
    }
    
}
```

### Annotations

```java
import java.lang.annotation.*;
import java.lang.reflect.*;

public class AnnotationDemo {
    
    public static void main(String[] args) throws Exception {
        
        // Using built-in annotations
        AnnotatedClass obj = new AnnotatedClass();
        obj.deprecatedMethod();
        obj.newMethod();
        
        // Using custom annotation
        Class<AnnotatedClass> clazz = AnnotatedClass.class;
        
        // Check if class has annotation
        if (clazz.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
            System.out.println("\nClass Annotation:");
            System.out.println("Author: " + annotation.author());
            System.out.println("Version: " + annotation.version());
        }
        
        // Check method annotations
        Method method = clazz.getMethod("annotatedMethod");
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("\nMethod Annotation:");
            System.out.println("Author: " + annotation.author());
            System.out.println("Version: " + annotation.version());
        }
        
    }
    
}

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface MyAnnotation {
    String author() default "Unknown";
    double version() default 1.0;
}

@MyAnnotation(author = "John Doe", version = 2.0)
class AnnotatedClass {
    
    // @Deprecated annotation
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated");
    }
    
    // @SuppressWarnings annotation
    @SuppressWarnings("unchecked")
    public void newMethod() {
        System.out.println("This is the new method");
    }
    
    @MyAnnotation(author = "Jane Smith", version = 1.5)
    public void annotatedMethod() {
        System.out.println("This method has custom annotation");
    }
    
}
```

### Reflection API

```java
import java.lang.reflect.*;

public class ReflectionDemo {
    
    public static void main(String[] args) {
        
        try {
            // Getting Class object
            Class<?> clazz = Student.class;
            // Alternative ways:
            // Class<?> clazz = Class.forName("Student");
            // Class<?> clazz = new Student().getClass();
            
            System.out.println("Class Name: " + clazz.getName());
            System.out.println("Simple Name: " + clazz.getSimpleName());
            System.out.println("Package: " + clazz.getPackage());
            
            // Getting fields
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName() + " - " + field.getType());
            }
            
            // Getting methods
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
            
            // Getting constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }
            
            // Creating instance using reflection
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object student = constructor.newInstance("Alice", 20);
            
            // Invoking method using reflection
            Method displayMethod = clazz.getMethod("display");
            displayMethod.invoke(student);
            
            // Accessing private field using reflection
            Field nameField = clazz.getDeclaredField("name");
            nameField.setAccessible(true);  // Bypass private access
            System.out.println("\nPrivate field value: " + nameField.get(student));
            
            // Modifying private field
            nameField.set(student, "Bob");
            displayMethod.invoke(student);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}

class Student {
    
    private String name;
    private int age;
    
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    private void privateMethod() {
        System.out.println("This is a private method");
    }
    
}
```

### Inner Classes

```java
public class InnerClassDemo {
    
    public static void main(String[] args) {
        
        // Member inner class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
        
        // Static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.show();
        
        // Local inner class
        outer.outerMethod();
        
        // Anonymous inner class
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous inner class");
            }
        };
        greeting.greet();
        
    }
    
}

class OuterClass {
    
    private int outerField = 10;
    private static int staticOuterField = 20;
    
    // Member inner class
    class InnerClass {
        
        public void display() {
            System.out.println("Outer field: " + outerField);
            System.out.println("Member inner class");
        }
        
    }
    
    // Static nested class
    static class StaticNestedClass {
        
        public void show() {
            System.out.println("Static outer field: " + staticOuterField);
            System.out.println("Static nested class");
        }
        
    }
    
    // Method with local inner class
    public void outerMethod() {
        
        final int localVariable = 30;
        
        // Local inner class
        class LocalInnerClass {
            
            public void print() {
                System.out.println("Local variable: " + localVariable);
                System.out.println("Outer field: " + outerField);
                System.out.println("Local inner class");
            }
            
        }
        
        LocalInnerClass local = new LocalInnerClass();
        local.print();
        
    }
    
}

// Interface for anonymous inner class
interface Greeting {
    void greet();
}
```

### Optional Class

```java
import java.util.Optional;

public class OptionalDemo {
    
    public static void main(String[] args) {
        
        // Creating Optional
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(null);
        Optional<String> optional4 = Optional.ofNullable("World");
        
        // isPresent and get
        if (optional1.isPresent()) {
            System.out.println("Value: " + optional1.get());
        }
        
        // ifPresent (with lambda)
        optional1.ifPresent(value -> System.out.println("If present: " + value));
        
        // orElse
        String value1 = optional2.orElse("Default value");
        System.out.println("\norElse: " + value1);
        
        // orElseGet (lazy evaluation)
        String value2 = optional2.orElseGet(() -> "Generated default");
        System.out.println("orElseGet: " + value2);
        
        // orElseThrow
        try {
            String value3 = optional2.orElseThrow(() -> 
                new IllegalArgumentException("Value not present"));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        // map
        Optional<Integer> length = optional1.map(String::length);
        System.out.println("\nLength: " + length.get());
        
        // flatMap
        Optional<String> upperCase = optional1.flatMap(s -> 
            Optional.of(s.toUpperCase()));
        System.out.println("Upper case: " + upperCase.get());
        
        // filter
        Optional<String> filtered = optional1.filter(s -> s.length() > 3);
        System.out.println("Filtered: " + filtered.orElse("Too short"));
        
        // Practical example
        String result = findUserById(1)
            .map(User::getName)
            .orElse("User not found");
        System.out.println("\nUser: " + result);
        
    }
    
    public static Optional<User> findUserById(int id) {
        if (id == 1) {
            return Optional.of(new User("Alice"));
        }
        return Optional.empty();
    }
    
}

class User {
    
    private String name;
    
    public User(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
}
```

### Date and Time API (Java 8+)

```java
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeAPIDemo {
    
    public static void main(String[] args) {
        
        // LocalDate
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        
        LocalDate specificDate = LocalDate.of(2024, 12, 25);
        System.out.println("Specific date: " + specificDate);
        
        // LocalTime
        LocalTime now = LocalTime.now();
        System.out.println("\nCurrent time: " + now);
        
        LocalTime specificTime = LocalTime.of(14, 30, 45);
        System.out.println("Specific time: " + specificTime);
        
        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\nCurrent date-time: " + dateTime);
        
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 12, 25, 10, 30);
        System.out.println("Specific date-time: " + specificDateTime);
        
        // ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("\nZoned date-time: " + zonedDateTime);
        
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokyo time: " + tokyo);
        
        // Date manipulation
        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate nextYear = today.plusYears(1);
        
        System.out.println("\nTomorrow: " + tomorrow);
        System.out.println("Next week: " + nextWeek);
        System.out.println("Next month: " + nextMonth);
        System.out.println("Next year: " + nextYear);
        
        // Date comparison
        LocalDate date1 = LocalDate.of(2024, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 12, 31);
        
        System.out.println("\nIs date1 before date2? " + date1.isBefore(date2));
        System.out.println("Is date1 after date2? " + date1.isAfter(date2));
        
        // Period (date-based)
        Period period = Period.between(date1, date2);
        System.out.println("\nPeriod: " + period.getMonths() + " months, " 
                          + period.getDays() + " days");
        
        // Duration (time-based)
        LocalTime time1 = LocalTime.of(10, 0);
        LocalTime time2 = LocalTime.of(14, 30);
        Duration duration = Duration.between(time1, time2);
        System.out.println("Duration: " + duration.toHours() + " hours");
        
        // Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(formatter);
        System.out.println("\nFormatted: " + formattedDate);
        
        // Parsing
        String dateString = "25-12-2024 10:30:00";
        LocalDateTime parsedDate = LocalDateTime.parse(dateString, formatter);
        System.out.println("Parsed: " + parsedDate);
        
        // ChronoUnit
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("\nDays between: " + daysBetween);
        
    }
    
}
```

---

## Conclusion

This comprehensive Java guide covers all major topics from basic syntax to advanced concepts. Here are some key takeaways:

### Core Concepts:
- **OOP Principles**: Encapsulation, Inheritance, Polymorphism, Abstraction
- **Exception Handling**: Robust error management with try-catch-finally
- **Collections Framework**: Efficient data structures for various use cases
- **Multithreading**: Concurrent programming for better performance

### Modern Java Features:
- **Lambda Expressions**: Functional programming paradigm
- **Stream API**: Declarative data processing
- **Optional**: Better null handling
- **Date/Time API**: Improved date and time manipulation

### Best Practices:
1. Use meaningful variable and method names
2. Follow proper indentation and coding standards
3. Handle exceptions appropriately
4. Use generics for type safety
5. Prefer composition over inheritance
6. Write clean, readable, and maintainable code
7. Use appropriate data structures for your use case
8. Leverage modern Java features for cleaner code

### Next Steps:
- Practice coding regularly
- Build real-world projects
- Explore frameworks like Spring, Hibernate
- Learn about design patterns
- Study data structures and algorithms
- Keep up with latest Java versions and features

**Happy Coding! ☕**

---

*This guide is designed to be a comprehensive reference for Java programming. Save it and refer back as needed during your Java development journey.* + age + ", Major: " + major);
    }
    
}
```

### Static Members

```java

public class StaticDemo {
    
    public static void main(String[] args) {
        
        // Accessing static variable without object
        System.out.println("Total students: " + StudentRecord.getTotalStudents());
        
        StudentRecord s1 = new StudentRecord("Alice");
        StudentRecord s2 = new StudentRecord("Bob");
        StudentRecord s3 = new StudentRecord("Charlie");
        
        System.out.println("Total students: " + StudentRecord.getTotalStudents());
        
        // Calling static method
        StudentRecord.displaySchoolName();
        
    }
    
}

class StudentRecord {
    
    private String name;
    
    // Static variable (shared by all instances)
    private static int totalStudents = 0;
    private static String schoolName = "ABC High School";
    
    // Constructor
    public StudentRecord(String name) {
        this.name = name;
        totalStudents++;  // Increment for each new student
    }
    
    // Static method
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    public static void displaySchoolName() {
        System.out.println("School: " + schoolName);
    }
    
    // Instance method
    public void displayName() {
        System.out.println("Student: " + name);
    }
    
    // Static block (executed when class is loaded)
    static {
        System.out.println("StudentRecord class loaded");
        schoolName = "XYZ High School";
    }
    
}
```

### Method Overloading

```java
public class MethodOverloadingDemo {
    
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.3));
        System.out.println("Sum of integer and double: " + calc.add(10, 20.5));
        
    }
    
}

class Calculator {
    
    // Method with 2 integer parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method with 3 integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method with 2 double parameters
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method with int and double parameters
    public double add(int a, double b) {
        return a + b;
    }
    
    // Method with different order of parameters
    public double add(double a, int b) {
        return a + b;
    }
    
}
```

---

## 7. Inheritance and Polymorphism

### Inheritance

```java
public class InheritanceDemo {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.displayInfo();
        
        System.out.println();
        
        Cat cat = new Cat("Whiskers", 2, "White");
        cat.eat();
        cat.sleep();
        cat.meow();
        cat.displayInfo();
        
    }
    
}

// Parent class (Superclass)
class Animal {
    
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: "