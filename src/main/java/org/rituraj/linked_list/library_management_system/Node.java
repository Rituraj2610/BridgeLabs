package org.rituraj.linked_list.library_management_system;

public class Node {
    Books data;
    Node next;
    Node prev;

    Node(Books data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
