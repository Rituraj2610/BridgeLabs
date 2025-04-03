package org.rituraj.json.data.handson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvToJson {
    public static void main(String[] args) {
        String csvFile = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\handson\\resources\\Employee.csv";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
            ){
            ObjectMapper objectMapper = new ObjectMapper();
            ArrayNode jsonArray = objectMapper.createArrayNode();

            String line;
            String[] headers = bufferedReader.readLine().split(",");

            while((line = bufferedReader.readLine())!=null){
                String[] arr = line.split(",");
                ObjectNode jsonNodes = objectMapper.createObjectNode();
                for(int i=0; i< headers.length; i++){
                    jsonNodes.put(headers[i], arr[i]);
                }

                jsonArray.add(jsonNodes);
            }

            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
