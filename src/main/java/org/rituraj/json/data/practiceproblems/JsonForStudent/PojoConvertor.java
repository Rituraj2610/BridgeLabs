package org.rituraj.json.data.practiceproblems.JsonForStudent;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class PojoConvertor {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = new Student("Happy", 21, new String[]{"English", "Hindi"});

            String jsonString = objectMapper.writeValueAsString(student);

            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
