package org.rituraj.csv.data.handling.advanced;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ValidateData {
    public static void main(String[] args) {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\SampleData.csv";

        try(CSVReader csvReader = new CSVReader(new FileReader(file))){
            String emailRegex = "^[a-zA-Z\\d_.+-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$";
            String numberRegex = "^\\+?[0-9]{1,4}?[-.\\s]?[0-9]{10,15}$";

            String[] line;
            while((line = csvReader.readNext())!=null){
                if(line[0].matches("Email") && line[1].matches("Phone")){
                    continue;
                }

                if(!line[0].matches(emailRegex) || !line[1].matches(numberRegex)){
                    System.out.println("Invalid Format: " + line[0] + " " + line[1]);
                }
            }
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
