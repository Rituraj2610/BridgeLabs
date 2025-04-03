package org.rituraj.json.data.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.validation.SchemaFactory;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import org.rituraj.csv.data.handling.intermediate.SortRecords;

import java.io.File;
import java.io.IOException;

public class ValidatingSchema {
    public static void main(String[] args) throws IOException {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\practiceproblems\\resources\\SampleData.json";
        String schemaFile = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\practiceproblems\\resources\\Schema.json";

        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode schemaNode = objectMapper.readTree(new File(schemaFile));
            JsonNode node = objectMapper.readTree(new File(file));

            JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.byDefault();
            JsonSchema jsonSchema = jsonSchemaFactory.getJsonSchema(schemaNode);

            if(jsonSchema.validate(node).isSuccess()){
                System.out.println("Valid Schema");
            }else{
                System.out.println("Invlaid Schema");
            }
        } catch (ProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
