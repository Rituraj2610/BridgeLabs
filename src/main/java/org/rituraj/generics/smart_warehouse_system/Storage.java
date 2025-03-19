package org.rituraj.generics.smart_warehouse_system;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WarehouseItem>{

    List<T> itemStorage = new ArrayList<>();


    public void storeItems(T items){
        itemStorage.add(items);
    }

    public List<T> getItem(){
        return itemStorage;
    }

}
