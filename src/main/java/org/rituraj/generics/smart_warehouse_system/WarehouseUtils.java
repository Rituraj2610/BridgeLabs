package org.rituraj.generics.smart_warehouse_system;

import java.util.List;

public class WarehouseUtils {

    // Method to display any type of storage list
    public static void displayItems(List<? extends WarehouseItem> list){
        for(WarehouseItem item : list){
            System.out.println(item);
        }
    }
}
