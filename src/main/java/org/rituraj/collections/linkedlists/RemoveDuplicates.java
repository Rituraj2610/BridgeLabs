package org.rituraj.collections.linkedlists;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void removeDuplicateValues(List<Integer> list){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(list);

        list.clear();
        list.addAll(linkedHashSet);
    }


    public static void main(String[] args) {
        // Sample list with more duplicates
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(20);

        System.out.println("Original List: " + list);

        // Remove duplicates
        removeDuplicateValues(list);

        System.out.println("List after removing duplicates: " + list);
    }

}
