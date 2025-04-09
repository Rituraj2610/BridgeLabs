package org.rituraj.multi_threading.executor_service;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParallelProcessign {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=0; i<10; i++){
            final int id = i;

            executorService.submit(() -> {
                System.out.println("Task " + id + " started by " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Task " + id + " completed by " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();

        try {
            if(!executorService.awaitTermination(2, TimeUnit.MINUTES)){
                executorService.shutdownNow();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
