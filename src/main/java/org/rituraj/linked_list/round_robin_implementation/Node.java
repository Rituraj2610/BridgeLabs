package org.rituraj.linked_list.round_robin_implementation;

public class Node {
    Process data;
    Node next;

    Node(Process data){
        this.data = data;
        this.next = this;
    }
}
