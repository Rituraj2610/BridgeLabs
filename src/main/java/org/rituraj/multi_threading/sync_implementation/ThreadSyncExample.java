package org.rituraj.multi_threading.sync_implementation;

public class ThreadSyncExample {
    public static void main(String[] args) {
            SharedCounter sharedCounter = new SharedCounter();

            Thread t1 = new Thread(new MyThread(sharedCounter));
            Thread t2 = new Thread(new MyThread(sharedCounter));

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Final counter value: " + sharedCounter.getCounter());
        }
}
