package org.rituraj.collections.queues;


import java.util.*;

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> -p.severity));
        queue.offer(new Patient("John", 3));
        queue.offer(new Patient("Alice", 5));
        queue.offer(new Patient("Bob", 2));

        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println("Treating: " + p.name + " (Severity: " + p.severity + ")");
        }
    }
}
