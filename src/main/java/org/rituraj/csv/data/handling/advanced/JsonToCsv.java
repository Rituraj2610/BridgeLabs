package org.rituraj.csv.data.handling.advanced;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonToCsv {
    public static void main(String[] args) {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\JsonData.json";
        
        try(CSVWriter csvWriter = new CSVWriter(new FileWriter("D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\JsonToCsv.csv"))){
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File(file));
            
            if(rootNode.isArray()){
                boolean isHeader = true;
                for (JsonNode node : rootNode) {
                    if (isHeader) {
                        // Write headers to CSV
                        List<String> fieldNames = new ArrayList<>();
                        node.fieldNames().forEachRemaining(fieldNames::add);
                        csvWriter.writeNext(fieldNames.toArray(new String[0]));
                        isHeader = false;
                        continue;
                    }

                    // Write values to CSV
                    List<String> values = new ArrayList<>();
                    node.fields().forEachRemaining(entry -> values.add(entry.getValue().asText()));
                    csvWriter.writeNext(values.toArray(new String[0]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
