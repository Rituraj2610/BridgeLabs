package org.rituraj.csv.data.handling.advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DetectDuplicate {
    public static void main(String[] args) {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\DuplicateEmployee.csv";

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file))) {

            List<String> linesFromReader2 = new ArrayList<>();
            String line2;
            while ((line2 = bufferedReader2.readLine()) != null) {
                linesFromReader2.add(line2);
            }

            String line1;
            while ((line1 = bufferedReader1.readLine()) != null) {
                String[] arr1 = line1.split(",");
                for (String record : linesFromReader2) {
                    String[] arr2 = record.split(",");
                    if (arr1[0].equals(arr2[0])) {
                        System.out.printf("%s, %s, %s, %s%n", arr1[0], arr1[1], arr1[2], arr1[3]);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
