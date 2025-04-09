package org.rituraj.design.patterns.observer;

public class Observer2 implements Observer{
    public void onDataReceived(String data){
        System.out.println(data + " Received");
    }
}
