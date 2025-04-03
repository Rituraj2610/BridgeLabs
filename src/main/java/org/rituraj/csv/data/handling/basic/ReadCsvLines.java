package org.rituraj.csv.data.handling.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvLines {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Student.csv";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            int line = -1;
            while(bufferedReader.readLine() != null){
                line++;
            }
            System.out.println(line);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
