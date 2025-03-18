package org.rituraj.sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int m = arr[i];
            int j = i;
            for(j=i; j>0 && arr[j-1]>arr[j]; j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            arr[j] = m;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {101, 45, 67, 89, 34};

        insertionSort(employeeIDs);

        System.out.println("Sorted employee IDs:");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}

