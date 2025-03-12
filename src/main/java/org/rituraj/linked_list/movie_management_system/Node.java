package org.rituraj.linked_list.movie_management_system;

public class Node {
    Movie data;
    Node next;
    Node prev;

    Node(Movie data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
