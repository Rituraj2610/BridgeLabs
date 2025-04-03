package org.rituraj.csv.data.handling.advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {
    public static void main(String[] args) {
        String filePath = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Employee.csv";

        int batchSize = 100;
        int recordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                recordCount++;
                String[] str = line.split(",");
                System.out.printf("%s, %s, %s, %s\n", str[0], str[1], str[2], str[3]);


                if (recordCount % batchSize == 0) {
                    System.out.println("Processed " + recordCount + " records so far...");
                }
            }


            System.out.println("Total records processed: " + recordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

