package org.rituraj.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> list = new ArrayList<>();
    public void register(Observer observer) {
        list.add(observer);
    }

    public void unregister(Observer observer) {
        list.remove(observer);
    }

    public void update() {
        for(Observer observer : list){
            observer.onDataReceived("Hello " + observer.getClass() );
        }
    }
}
