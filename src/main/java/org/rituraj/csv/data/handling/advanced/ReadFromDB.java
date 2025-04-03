package org.rituraj.csv.data.handling.advanced;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.rituraj.csv.data.handling.advanced.csvtoobject.Student;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReadFromDB {
    public static void main(String[] args) {
        String file = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\Student.csv";
        String file2 = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\csv\\data\\handling\\resource\\StudentDB.csv";


        try(CSVWriter csvWriter = new CSVWriter(new FileWriter(file2));
            FileReader fileReader = new FileReader(file)){

            CsvToBean<Student> csvToBean = new CsvToBeanBuilder<Student>(fileReader)
                    .withType(Student.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<Student> list = csvToBean.parse();

            String[] header = {"ID", "Name", "Age", "Marks"};
            csvWriter.writeNext(header);
            for(Student s : list){
                String[] arr = {s.getId(), s.getName(), s.getName(), s.getMarks()};
                csvWriter.writeNext(arr);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
