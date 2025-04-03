package org.rituraj.csv.data.handling.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvFile {
    public static void main(String[] args) throws FileNotFoundException {

        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Student.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[] arr = line.split(",");
                System.out.println("ID: " + arr[0] + "Name: " + arr[1] + "Age: "+ arr[2] + "Marks: " + arr[3]);
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
