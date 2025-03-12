package org.rituraj.linked_list.undo_redo_functionality;

public class Node {
    String data;
    Node next;
    Node prev;

    Node(String data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
