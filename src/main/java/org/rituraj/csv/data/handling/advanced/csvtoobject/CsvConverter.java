package org.rituraj.csv.data.handling.advanced.csvtoobject;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvConverter {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Student.csv";

        List<Student> studentList;
        try(FileReader fileReader = new FileReader(file)){
            CsvToBean<Student> csvToBean = new CsvToBeanBuilder<Student>(fileReader)
                    .withType(Student.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            studentList = csvToBean.parse();
            for(Student s : studentList){
                System.out.println(s);
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}


