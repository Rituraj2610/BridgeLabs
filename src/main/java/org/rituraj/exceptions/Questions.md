# Java Exception Handling – Practice Problems

This document outlines a series of practice problems covering different types of exceptions in Java, including checked, unchecked, custom exceptions, and exception propagation.

---

## 1. Checked Exception (Compile-time Exception)

**💡 Problem Statement:**  
Create a Java program that reads a file named `"data.txt"`. If the file does not exist, handle the `IOException` and display a user-friendly message.

**✅ Expected Behavior:**
- If the file exists, print its contents.
- If the file does not exist, catch the exception and print: `"File not found"`.

---

## 2. Unchecked Exception (Runtime Exception)

**💡 Problem Statement:**  
Write a Java program that takes two numbers as input and performs division.

**Handle:**
- `ArithmeticException` for division by zero.
- `InputMismatchException` for invalid (non-numeric) input.

**✅ Expected Behavior:**
- Valid input → Print result of division.
- Denominator is 0 → Handle with message: `"Cannot divide by zero!"`.
- Non-numeric input → Handle with message: `"Invalid input! Please enter numbers only."`

---

## 3. Custom Exception (User-defined Exception)

**💡 Problem Statement:**  
Create a custom exception class `InvalidAgeException`. Write a method `validateAge(int age)` that throws this exception if the age is below 18.

**✅ Expected Behavior:**
- Age ≥ 18 → Print: `"Access granted!"`
- Age < 18 → Throw exception and print: `"Age must be 18 or above"`

---

## 4. Multiple Catch Blocks

**💡 Problem Statement:**  
Write a Java program to:
- Accept an integer array and an index.
- Print the element at the given index.

**Handle:**
- `ArrayIndexOutOfBoundsException`
- `NullPointerException`

**✅ Expected Behavior:**
- Valid → Print: `"Value at index X: Y"`
- Invalid index → `"Invalid index!"`
- Null array → `"Array is not initialized!"`

---

## 5. Try-with-Resources (Auto-close Resources)

**💡 Problem Statement:**  
Read the first line of `"info.txt"` using `BufferedReader` with try-with-resources.

**✅ Expected Behavior:**
- File exists → Print the first line.
- File not found / error → Print: `"Error reading file"`

---

## 6. `throw` vs. `throws` (Exception Propagation)

**💡 Problem Statement:**  
Create a method `calculateInterest(double amount, double rate, int years)` that:
- Throws `IllegalArgumentException` for negative values.
- Propagates the exception using `throws` and handles it in `main()`.

**✅ Expected Behavior:**
- Valid input → Print interest.
- Invalid input → `"Invalid input: Amount and rate must be positive"`

---

## 7. `finally` Block Execution

**💡 Problem Statement:**  
Write a program that:
- Takes two integers from the user.
- Performs division.
- Demonstrates the `finally` block.

**✅ Expected Behavior:**
- Valid → Print result.
- Division by zero → Handle and print message.
- Always → Print: `"Operation completed"`

---

## 8. Exception Propagation in Methods

**💡 Problem Statement:**  
Create a program with the following structure:
- `method1()` throws `ArithmeticException` (10 / 0)
- `method2()` calls `method1()`
- `main()` calls `method2()` and handles the exception.

**✅ Expected Behavior:**
- Exception flows to `main()`, which handles it with: `"Handled exception in main"`

---

## 9. Nested try-catch Block

**💡 Problem Statement:**  
Take an array and divisor as input. Use nested try-catch blocks for:
- Accessing array element at a given index.
- Dividing the element by the divisor.

**✅ Expected Behavior:**
- Valid → Print result.
- Invalid index → `"Invalid array index!"`
- Division by zero → `"Cannot divide by zero!"`

---

## 10. Bank Transaction System (Checked + Custom Exception)

**💡 Problem Statement:**  
Create a simple bank system with a `withdraw(double amount)` method that:
- Throws `InsufficientBalanceException` if withdrawal exceeds balance.
- Throws `IllegalArgumentException` if amount is negative.

**✅ Expected Behavior:**
- Valid → Print: `"Withdrawal successful, new balance: X"`
- Insufficient funds → `"Insufficient balance!"`
- Negative amount → `"Invalid amount!"`

---
