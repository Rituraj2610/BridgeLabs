package org.rituraj.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] prices, int left, int right) {
        if(left < right){
            int mid = left + (right-left)/2;
            mergeSort(prices, left, mid);
            mergeSort(prices,mid+1, right);
            merge(prices, left, mid, right);
        }
    }

    private static void merge(int[] prices, int left, int mid, int right){
        int[] leftArr = Arrays.copyOfRange(prices, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(prices, mid+1, right+1);

        int i=0, j=0, k=left;

        while(i < leftArr.length && j < rightArr.length){
            prices[k++] = (leftArr[i] < rightArr[j]) ?  leftArr[i++] : rightArr[j++];
        }

        while(i < leftArr.length ){
            prices[k++] = leftArr[i++];
        }

        while(j < rightArr.length){
            prices[k++] = rightArr[j++];
        }
    }


    public static void main(String[] args) {
        int[] bookPrices = {350, 120, 450, 300, 200, 500};

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted book prices:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}

