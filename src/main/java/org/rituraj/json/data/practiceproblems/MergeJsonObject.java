package org.rituraj.json.data.practiceproblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObject {
    public static void main(String[] args) {
        String json1 = "{ \"id\": 1, \"name\": \"John Doe\", \"email\": \"john.doe@example.com\" }";

        String json2 = "{ \"department\": \"Engineering\", \"location\": \"New York\", \"salary\": 85000 }";

        try{
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode jsonNode1 = objectMapper.readTree(json1);
            JsonNode jsonNode2 = objectMapper.readTree(json2);

            JsonNode mergeNode = jsonNode1.deepCopy();

            jsonNode2.fields().forEachRemaining(entry -> {
                ((ObjectNode) mergeNode).set(entry.getKey(), entry.getValue());
            });

            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergeNode));
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
