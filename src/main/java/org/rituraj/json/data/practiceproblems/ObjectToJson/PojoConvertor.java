package org.rituraj.json.data.practiceproblems.ObjectToJson;


import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PojoConvertor {
    public static void main(String[] args) {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\practiceproblems\\resources\\SampleData2.json";

        Student student1 = new Student("Alice", 18, new String[]{"Math", "Science", "History"});
        Student student2 = new Student("Bob", 20, new String[]{"Physics", "Chemistry", "Biology"});
        Student student3 = new Student("Charlie", 17, new String[]{"Economics", "English", "Political Science"});
        Student student4 = new Student("Daisy", 19, new String[]{"Computer Science", "Statistics", "Artificial Intelligence"});
        Student student5 = new Student("Ethan", 21, new String[]{"Psychology", "Philosophy", "Sociology"});

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        try{
            ObjectMapper objectMapper = new ObjectMapper();

//            for(Student s : list){
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(file), list);
//            }
        } catch (StreamWriteException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

