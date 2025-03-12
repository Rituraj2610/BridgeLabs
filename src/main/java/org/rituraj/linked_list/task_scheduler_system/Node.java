package org.rituraj.linked_list.task_scheduler_system;

public class Node {
    Task data;
    Node next;

    Node(Task data){
        this.data = data;
        this.next = this;
    }
}
