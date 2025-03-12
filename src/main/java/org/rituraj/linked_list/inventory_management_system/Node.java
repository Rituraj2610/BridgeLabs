package org.rituraj.linked_list.inventory_management_system;

public class Node {
    Item data;
    Node next;

    Node(Item data){
        this.data = data;
        this.next = null;
    }
}
