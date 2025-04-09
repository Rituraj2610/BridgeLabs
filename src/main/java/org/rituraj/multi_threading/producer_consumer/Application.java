package org.rituraj.multi_threading.producer_consumer;

public class Application {
    public static void main(String[] args) {

    ProducerConsumer pc = new ProducerConsumer();

    Thread producer = new Thread(() -> {
        try {
            pc.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    Thread consumer = new Thread(() -> {
        pc.consume();
    });

        producer.start();
        consumer.start();
}
}

