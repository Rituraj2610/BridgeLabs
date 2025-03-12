package org.rituraj.linked_list.social_media_friend_connections;

public class IdNode {
    private Integer data;
    private IdNode next;

    IdNode(){};

    IdNode(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public IdNode getNext() {
        return next;
    }

    public void setNext(IdNode next) {
        this.next = next;
    }
}
