package org.rituraj.csv.data.handling.intermediate;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ModifyRecord {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Employee.csv";

        try (CSVReader csvReader = new CSVReader(new FileReader(file));
             Scanner sc = new Scanner(System.in)){
            String[] data;
            while((data = csvReader.readNext()) != null){
                if(data[2].equals("IT")){
                    String salary = data[3];

                    int i = Integer.parseInt(salary);
                    i += (i * 0.1);
                    data[3] = String.valueOf(i);
                }

                System.out.println(data[0] +"\t"+data[1] +"\t" + data[2]+"\t" + data[3]);
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
