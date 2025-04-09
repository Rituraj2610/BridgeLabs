package org.rituraj.multi_threading.manual_locking;

import com.opencsv.validators.LineValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class Application {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem(new Item("A", 5));
        inventory.addItem(new Item("B", 77));
        inventory.addItem(new Item("C", 2));
        inventory.addItem(new Item("D", 12));
        inventory.addItem(new Item("E", 9));

        // Get all items while holding the lock to ensure thread safety
        List<Item> items;
        inventory.getLock().lock();
        try {
            items = new ArrayList<>(inventory.getList());
        } finally {
            inventory.getLock().unlock();
        }

        Thread t1 = new Thread(() -> inventory.addStockToItem(items.get(1), 20));
        Thread t2 = new Thread(() -> inventory.addStockToItem(items.get(1), 20));
        Thread t3 = new Thread(() -> inventory.removeStockToItem(items.get(1), 7));
        Thread t4 = new Thread(() -> inventory.addStockToItem(items.get(2), 7));
        Thread t5 = new Thread(() -> inventory.removeStockToItem(items.get(3), 7));
        Thread t6 = new Thread(() -> inventory.removeStockToItem(items.get(0), 2));

        t6.start();
        t3.start();
        t1.start();
        t5.start();
        t4.start();
        t2.start();
    }
}
