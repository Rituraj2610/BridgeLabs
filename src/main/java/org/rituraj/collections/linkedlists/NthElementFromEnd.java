package org.rituraj.collections.linkedlists;

import java.util.*;

public class NthElementFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        // Edge case: if list is empty or N is invalid
        if (list == null || n <= 0) {
            return "Invalid Input";
        }

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        // Move fast pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                return "N is larger than list size";
            }
        }

        // Move both pointers until fast reaches the end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next(); // Slow is now at the Nth element from end
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;
        System.out.println(findNthFromEnd(list, N)); // Output: D
    }
}
