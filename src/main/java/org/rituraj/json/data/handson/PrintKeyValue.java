package org.rituraj.json.data.handson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class PrintKeyValue {
    public static void main(String[] args) {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\handson\\resources\\SampleData2.json";

        try{
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode rootNode = objectMapper.readTree(new File(file));

            if(rootNode.isArray()){
                for(JsonNode node : rootNode){
            node.fields().forEachRemaining(entry -> {
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            });

                }
            }else if (rootNode.isObject()) {
                rootNode.fields().forEachRemaining(entry -> {
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                });
            } else {
                System.out.println("Unsupported JSON structure!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
