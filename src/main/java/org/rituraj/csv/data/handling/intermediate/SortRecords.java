package org.rituraj.csv.data.handling.intermediate;

import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SortRecords {
    public static void main(String[] args) {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Employee.csv";

        List<String[]> records = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[] arr = line.split(",");
                records.add(arr);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        Collections.sort(records, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o2[3].compareTo(o1[3]);
            }
        });

        try(CSVWriter csvWriter = new CSVWriter(new FileWriter(file))){
            csvWriter.writeAll(records);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
