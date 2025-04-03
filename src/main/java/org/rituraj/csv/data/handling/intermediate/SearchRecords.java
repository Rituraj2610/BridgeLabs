package org.rituraj.csv.data.handling.intermediate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchRecords {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Employee.csv";

        try (CSVReader csvReader = new CSVReader(new FileReader(file));
                Scanner sc = new Scanner(System.in)){
            String[] data;
            String str = sc.nextLine();
            while((data = csvReader.readNext()) != null){
                if(data[1].equals(str)){
                    System.out.println("Dept: " + data[2] + " Salary: " + data[3]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
