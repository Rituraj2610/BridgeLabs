package org.rituraj.collections.linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReverseList {
    public static void reverseLinkedList(List<Integer> linkedList){
        Stack<Integer> stack = new Stack<>();
        for(int i : linkedList){
            stack.push(i);
        }

        linkedList.clear();

        while(!stack.isEmpty()){
            linkedList.add(stack.pop());
        }
    }

    public static void reverseArrayList(List<Integer> arrayList){
        List<Integer> newList = new ArrayList<>();

        for(int i= arrayList.size()-1; i>=0; i--){
             newList.add(arrayList.get(i));
        }

        arrayList.clear();
        arrayList.addAll(newList);
    }

    public static void main(String[] args) {
        // Initialize a LinkedList with sample data
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            linkedList.add(i);
        }
        System.out.println("Original LinkedList: " + linkedList);

        // Reverse the LinkedList
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);

        // Initialize an ArrayList with sample data
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 6; i <= 10; i++) {
            arrayList.add(i);
        }
        System.out.println("Original ArrayList: " + arrayList);

        // Reverse the ArrayList
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);
    }
}
