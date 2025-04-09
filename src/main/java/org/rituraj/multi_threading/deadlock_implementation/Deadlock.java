package org.rituraj.multi_threading.deadlock_implementation;

public class Deadlock {
    public static void main(String[] args) {
        SampleResource sampleResource1 = new SampleResource();
        SampleResource sampleResource2 = new SampleResource();

        Thread t1 = new Thread(()->{
            synchronized (sampleResource1){
                System.out.println("T1: Locked res 1");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            synchronized (sampleResource2){
                System.out.println("T1: Locked res 2");
            }
            }
        }
    );

        Thread t2 = new Thread(()->{
            synchronized (sampleResource2){
                System.out.println("T2: Locked res 2");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            synchronized (sampleResource1){
                System.out.println("T2: Locked res 1");
            }
            }
        }
    );

        t1.start();
        t2.start();



}}
