package org.rituraj.csv.data.handling.basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsvFile {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter( "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Employee.csv"))){
            bufferedWriter.write("ID, Name, Department, Salary\n");
            bufferedWriter.write(" 1,John Doe,Engineering,85000\n");
            bufferedWriter.write(" 2,Jane Smith,Marketing,75000\n");
            bufferedWriter.write("3,Michael Brown,Sales,62000\n");
            bufferedWriter.write("4,Sophia Johnson,HR,72000\n");
            bufferedWriter.write("5,Emma Williams,IT,95000\n");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
