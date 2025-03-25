package org.rituraj.collections.set;

import java.util.*;

public class SetSymmetricDifference {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> diff = new HashSet<>(set1);
        diff.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        diff.removeAll(intersection);
        return diff;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));
    }
}
