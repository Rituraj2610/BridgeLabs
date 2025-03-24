package org.rituraj.collections.streams;

import java.io.*;
import java.util.Arrays;
import java.util.List;

class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000)
        );
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
        } catch (IOException e) { e.printStackTrace(); }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> list = (List<Employee>) ois.readObject();
            list.forEach(emp -> System.out.println(emp.name));
        } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
    }
}