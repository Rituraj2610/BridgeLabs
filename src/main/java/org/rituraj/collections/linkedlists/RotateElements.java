package org.rituraj.collections.linkedlists;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RotateElements {

    public static void rotate(List<Integer> list, int rotateBy) {
        int n = list.size();
        rotateBy = rotateBy % n;

        reverse(list, 0, rotateBy-1);
        reverse(list, rotateBy, n-1);
        reverse(list, 0, n-1);
    }

    private static void reverse(List<Integer> list, int s, int e){
        while(s < e){
            Collections.swap(list, s++, e--);
        }
    }

    public static void main(String[] args) {
        // Initialize sample list
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // Convert immutable list to mutable (as List.of() creates immutable lists)
        list = new java.util.ArrayList<>(list);

        System.out.println("Original List: " + list);

        // Rotate the list
        int rotateBy = 11;
        rotate(list, rotateBy);

        System.out.println("Rotated List by " + rotateBy + ": " + list);
    }

}
