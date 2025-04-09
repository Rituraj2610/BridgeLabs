package org.rituraj.design.patterns.observer;

public class Observer3 implements Observer{
    public void onDataReceived(String data){
        System.out.println(data + " Received");
    }
}
