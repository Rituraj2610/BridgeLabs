package org.rituraj.csv.data.handling.intermediate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Student.csv";

        try(CSVReader csvReader = new CSVReader(new FileReader(file))){
            String[] data;
            while((data = csvReader.readNext())!=null){
                if(data[3].matches("8[0-9]|9[0-9]|100")){
                    System.out.println("Student with greater marks than 80 is: " + data[1]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
