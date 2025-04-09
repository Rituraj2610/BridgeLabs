package org.rituraj.multi_threading.print_values;

public class MyThread extends Thread{
    @Override
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println("In method " +Thread.currentThread().getState());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("In class " + myThread.getState());
        myThread.start();
        System.out.println("In class " + myThread.getState());
        myThread.join();
        System.out.println("In class " + myThread.getState());

    }
}
