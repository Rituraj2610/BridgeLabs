package org.rituraj.json.data.practiceproblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ParseJson {
    public static void main(String[] args) {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\practiceproblems\\resources\\SampleData2.json";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File(file));

            if(rootNode.isArray()){
                for(JsonNode node : rootNode){
                    if(node.get("age").asInt() > 25){
                        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(node));

                    }
                }
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
