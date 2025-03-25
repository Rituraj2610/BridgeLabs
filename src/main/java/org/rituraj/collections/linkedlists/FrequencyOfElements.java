package org.rituraj.collections.linkedlists;

import java.util.*;

public class FrequencyOfElements {

    public static void frequency(List<String> list, HashMap<String, Integer> hashMap){
        for(String str : list){
            int i = hashMap.getOrDefault(str, 0);
            hashMap.put(str, i+1);
        }

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println("Key: " + key + " " + "Value: " + value);
        }
    }

    public static void main(String[] args) {
        // Sample list with repeated elements
        List<String> list = new ArrayList<>();
        list.addAll(List.of("apple", "banana", "apple", "orange", "banana", "banana", "grape"));

        // HashMap to store frequencies
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Call frequency method
        frequency(list, hashMap);
    }

}
