package org.rituraj.json.data.handson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;
import java.io.IOException;

public class ValidateEmail {
    public static void main(String[] args) {
        String jsonString = "{ \"email\": \"user@example.com\" }";
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\handson\\resources\\EmailSchema.json";


        try{
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode schemaNode = objectMapper.readTree(new File(file));
            JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.byDefault();
            JsonSchema jsonSchema = jsonSchemaFactory.getJsonSchema(schemaNode);

            JsonNode jsonNode = objectMapper.readTree(jsonString);

            if(jsonSchema.validate(jsonNode).isSuccess()){
                System.out.println("Valid Email");
            }else{
                System.out.println("Invalid Email");
            }
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (ProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
