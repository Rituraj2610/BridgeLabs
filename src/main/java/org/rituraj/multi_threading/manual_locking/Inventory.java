package org.rituraj.multi_threading.manual_locking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Inventory {
    private List<Item> list = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    public void addItem(Item item){
        list.add(item);
    }

    public void addStockToItem(Item item, int stock) {
        lock.lock();
        try {
            item.setQuantity(item.getQuantity() + stock);
            printList();
        } finally {
            lock.unlock();
        }
    }

    public void removeStockToItem(Item item, int stock) {
        lock.lock();
        try {
            item.setQuantity(item.getQuantity() - stock);
            printList();
        } finally {
            lock.unlock();
        }
    }

    public void printList(){
        System.out.println(list);
    }

}
