package org.rituraj.java_programming_elements.level1;

public class PenDivision {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int pensPerStudent = pens / students;
        int remainingPens = pens % students;
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d", pensPerStudent, remainingPens);
    }
}
