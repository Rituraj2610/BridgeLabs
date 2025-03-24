package org.rituraj.collections.streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("user_data.txt")) {
            System.out.print("Enter Name: ");
            String name = br.readLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Enter Favorite Language: ");
            String language = br.readLine();
            fw.write(name + ", " + age + ", " + language);
            System.out.println("Data saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}