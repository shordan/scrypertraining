# Java Basics

- **[Core Java Notes](10-Core-java-notes.pdf):** Notes of the Java language.

## Variables

In Java, variables are containers for storing data values. They must be declared with a data type before being used.

```java
// Example of variable declaration and initialization
int age = 25;
String name = "John";
// Example of a for loop
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```
## Loops
Java supports different types of loops, including for, while, and do-while.

```java
// Example of a while loop
int count = 0;
while (count < 3) {
    System.out.println("Count: " + count);
    count++;
}
```
## Conditionals
Conditional statements in Java include if, else if, and else.

```java
// Example of if-else statement
int number = 10;
if (number > 0) {
    System.out.println("Positive number");
} else if (number < 0) {
    System.out.println("Negative number");
} else {
    System.out.println("Zero");
}
```
## Classes and Objects
Java is an object-oriented programming language, and classes are the blueprint for objects.

```java
// Example of a simple class
class Car {
    String brand;
    String model;

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

// Creating an object of the Car class
Car myCar = new Car();
myCar.brand = "Toyota";
myCar.model = "Camry";
myCar.displayInfo();

```
## Methods and Functions
Methods in Java are blocks of code that perform a specific task and are defined within a class.

```java
// Example of a method
int addNumbers(int a, int b) {
    return a + b;
}

// Calling the method
int sum = addNumbers(5, 7);
System.out.println("Sum: " + sum);

```
## Object-Oriented Programming (OOP)
Java supports OOP principles like encapsulation, inheritance, and polymorphism.

```java
// Example of inheritance
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
```
