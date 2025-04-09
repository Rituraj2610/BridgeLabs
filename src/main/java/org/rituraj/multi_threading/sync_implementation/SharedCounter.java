package org.rituraj.multi_threading.sync_implementation;

public class SharedCounter {
    private int counter;

    public synchronized void increment() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }
}
