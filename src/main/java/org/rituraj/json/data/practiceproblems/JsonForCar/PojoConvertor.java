package org.rituraj.json.data.practiceproblems.JsonForCar;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoConvertor {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            Car student = new Car("KUV", "4-Wheelers", 40.2123);

            String jsonString = objectMapper.writeValueAsString(student);

            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
