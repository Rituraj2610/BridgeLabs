package org.rituraj.linked_list.online_ticket_reservation_system;

public class Node {
    Ticket data;
    Node next;

    Node(Ticket data){
        this.data = data;
        this.next = this;
    }
}
