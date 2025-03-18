package org.rituraj.sorting;

import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] ages) {
        int max = Arrays.stream(ages).max().orElse(0);
        int[] count = new int[max + 1];

        for(int num : ages){
            count[num]++ ;
        }

//        for(int n : count){
//            System.out.print(n + " ");
//        }

        int index = 0;

        for(int i=0; i<count.length; i++){
            while(count[i]-- > 0){
                ages[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 10, 14, 18, 10, 16, 14, 12, 11, 13};

        countingSort(studentAges);

        System.out.println("Sorted student ages:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}
