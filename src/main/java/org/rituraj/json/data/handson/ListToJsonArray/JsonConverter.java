package org.rituraj.json.data.handson.ListToJsonArray;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.rituraj.json.data.practiceproblems.ObjectToJson.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonConverter {
    public static void main(String[] args) throws IOException {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\handson\\resources\\SampleData2.json";

        org.rituraj.json.data.practiceproblems.ObjectToJson.Student student1 = new org.rituraj.json.data.practiceproblems.ObjectToJson.Student("Alice", 18, new String[]{"Math", "Science", "History"});
        org.rituraj.json.data.practiceproblems.ObjectToJson.Student student2 = new org.rituraj.json.data.practiceproblems.ObjectToJson.Student("Bob", 20, new String[]{"Physics", "Chemistry", "Biology"});
        org.rituraj.json.data.practiceproblems.ObjectToJson.Student student3 = new org.rituraj.json.data.practiceproblems.ObjectToJson.Student("Charlie", 17, new String[]{"Economics", "English", "Political Science"});
        org.rituraj.json.data.practiceproblems.ObjectToJson.Student student4 = new org.rituraj.json.data.practiceproblems.ObjectToJson.Student("Daisy", 19, new String[]{"Computer Science", "Statistics", "Artificial Intelligence"});
        org.rituraj.json.data.practiceproblems.ObjectToJson.Student student5 = new org.rituraj.json.data.practiceproblems.ObjectToJson.Student("Ethan", 21, new String[]{"Psychology", "Philosophy", "Sociology"});

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(file), list);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
