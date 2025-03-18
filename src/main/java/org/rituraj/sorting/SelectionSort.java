package org.rituraj.sorting;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for(int i=arr.length-1; i>=0; i--){
            int m = 0;
            for(int j = 1; j<=i; j++){
                if(arr[j] > arr[m]){
                    m = j;
                }
            }

            int temp = arr[m];
            arr[m] = arr[i];
            arr[i] = temp;


        }
    }

    public static void main(String[] args) {

        int[] examScores = {85, 72, 96, 64, 45, 78};

        selectionSort(examScores);

        System.out.println("Sorted exam scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}

