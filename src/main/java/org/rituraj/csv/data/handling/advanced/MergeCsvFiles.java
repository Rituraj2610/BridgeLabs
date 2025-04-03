package org.rituraj.csv.data.handling.advanced;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeCsvFiles {
    public static void main(String[] args) {
        String file1 = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Student1.csv";
        String file2 = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Student2.csv";
        String file3 = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\TotalStudent.csv";


        try(CSVReader csvReader1 = new CSVReader(new FileReader(file1));
            CSVReader csvReader2 = new CSVReader(new FileReader(file2));
            CSVWriter csvWriter = new CSVWriter(new FileWriter(file3));
        ){
            String[] line1;
            String[] line2;
//            String[] header = {"ID", "Name", "Marks", "Age", "Grade"};
//            csvWriter.writeNext(header);
            while((line1 = csvReader1.readNext())!=null && (line2 = csvReader2.readNext())!=null){
                if(line1[0].equals(line2[0])){

                    String[] arr = {line1[0], line1[1], line1[2], line2[1], line2[2]};

                    csvWriter.writeNext(arr);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
