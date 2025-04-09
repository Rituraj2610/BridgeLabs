package org.rituraj.multi_threading.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public void consume(){
        while(true){
            synchronized (this){
                try {

                if(queue.isEmpty()){
                    wait();
                }

                int value = queue.poll();
                System.out.println("Consumed: " + value);
                notify();
                Thread.sleep(1000);
            }catch (InterruptedException e){
                    e.printStackTrace();
                }
                }
        }
    }

    public void produce() throws InterruptedException {
        int value = 0;
        while(true){
            synchronized (this){
                if(queue.size() == CAPACITY){
                    wait();
                }
                System.out.println("Producer produced: " + value);
                queue.offer(value++);
                notify();
                Thread.sleep(1000);
            }
        }

    }
}
