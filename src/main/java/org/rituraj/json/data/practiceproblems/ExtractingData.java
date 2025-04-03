package org.rituraj.json.data.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ExtractingData {
    public static void main(String[] args) {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\practiceproblems\\resources\\SampleData.json";

        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File(file));
            if(rootNode.isArray()){
                for(JsonNode node : rootNode){
            System.out.println(node.get("name").asText());
            System.out.println(node.get("email").asText());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
