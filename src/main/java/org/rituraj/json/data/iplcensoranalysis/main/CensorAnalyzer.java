package org.rituraj.json.data.iplcensoranalysis.main;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CensorAnalyzer {
    public static void main(String[] args) throws IOException {
        String jsonFile = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\iplcensoranalysis\\resources\\JsonData.json";
        String csvFile = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\iplcensoranalysis\\resources\\CSVData.csv";

        jsonCensorship(jsonFile);
        csvCensorship(csvFile);
    }

    private static void csvCensorship(String csvFile) {
        try(CSVReader csvReader = new CSVReader(new FileReader(csvFile));
            CSVWriter csvWriter = new CSVWriter(new FileWriter("D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\iplcensoranalysis\\resources\\CSVDataOutput.csv"))
        ){
            String[] arr;
            boolean isFirstLine = true;

            while((arr = csvReader.readNext()) != null ){
                if(isFirstLine){
                    csvWriter.writeNext(arr);
                    isFirstLine = false;
                    continue;
                }
                arr[1] = arr[1].replaceAll(" .*", "****");
                arr[2] = arr[2].replaceAll(" .*", "****");
                arr[5] = arr[5].replaceAll(" .*", "****");
                arr[6] = "REDACTED";
                csvWriter.writeNext(arr);
            }


//            csvWriter.wr
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }

    private static void jsonCensorship(String jsonFile) throws IOException {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(jsonFile));

            if(jsonNode.isArray()){
                for(JsonNode node : jsonNode){

                    if(node.get("team1") != null){
                        String val = node.get("team1").asText().replaceAll(" .*", " ****");
                        ((ObjectNode) node).put("team1", val);
                    }
                    if(node.get("team2") != null){
                        String val = node.get("team2").asText().replaceAll(" .*", " ****");
                        ((ObjectNode) node).put("team2", val);
                    }

                    if(node.get("winner")!=null){
                        String val = node.get("winner").asText().replaceAll(" .*", " ****");
                        ((ObjectNode) node).put("winner", val);
                    }

                    List<String> teamNames = new ArrayList<>();

                    ObjectNode scoreNode = (ObjectNode) node.get("score");
                    scoreNode.fieldNames().forEachRemaining(teamNames::add);

                    for(String teamName : teamNames){
                        String censor = teamName.replaceAll(" .*", " ****");
                        JsonNode value = scoreNode.get(teamName);
                        scoreNode.remove(teamName);
                        scoreNode.put(censor, value);
                    }


                    ((ObjectNode) node).put("player_of_match", "REDACTED");
                }
            }

            String outputJsonFile = "D:\\ritik c\\1) CU\\EIGTH SEM\\BridgeLabs\\src\\main\\java\\org\\rituraj\\json\\data\\iplcensoranalysis\\resources\\JsonDataOutput.json";
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputJsonFile), jsonNode);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
