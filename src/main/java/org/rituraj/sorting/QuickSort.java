package org.rituraj.sorting;

public class QuickSort {

    public static void quickSort(int[] prices, int low, int high) {
       if(low < high){
           int pivotIndex = partition(prices, low, high);
           quickSort(prices, low, pivotIndex-1);
           quickSort(prices, pivotIndex+1, high);
       }
    }

    public static int partition(int[] prices, int low, int high){
        int pivot = prices[high];
        int i = low - 1;
        for(int j = low; j<high; j++){
            if(prices[j] < pivot){
                i++;
                swap(prices,i,j);
            }
        }
        swap(prices, high, i+1);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] productPrices = {150, 450, 100, 250, 300, 200};

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted product prices:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
