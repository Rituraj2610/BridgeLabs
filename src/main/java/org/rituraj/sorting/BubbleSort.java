package org.rituraj.sorting;

public class BubbleSort {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {75, 85, 60, 90, 40, 70};

        bubbleSort(studentMarks);

        System.out.println("Sorted student marks:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}
