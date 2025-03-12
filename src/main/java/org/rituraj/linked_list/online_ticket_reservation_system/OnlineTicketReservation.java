package org.rituraj.linked_list.online_ticket_reservation_system;

import java.time.LocalDateTime;

public class OnlineTicketReservation {
    Node head;
    Node tail;

    OnlineTicketReservation(){
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        OnlineTicketReservation system = new OnlineTicketReservation();

        // Adding tickets

        Ticket ticket1 = new Ticket(1, "Alice", "Inception", 101, LocalDateTime.now());
        Ticket ticket2 = new Ticket(2, "Bob", "Avatar", 102, LocalDateTime.now().minusHours(2));
        Ticket ticket3 = new Ticket(3, "Charlie", "Interstellar", 103, LocalDateTime.now().minusDays(1));
        Ticket ticket4 = new Ticket(4, "Diana", "Titanic", 104, LocalDateTime.now().minusMinutes(30));
                system.addLast(ticket1);
        system.addLast(ticket2);
        system.addLast(ticket3);
        system.addLast(ticket4);
        // Display all tickets
        System.out.println("All Tickets:");
        system.display();

        // Remove a ticket by ID
        System.out.println("\nRemoving Ticket with ID 2...");
        system.removeById(2);

        // Display all tickets after removal
        System.out.println("Tickets after removal:");
        system.display();

        // Find a ticket by movie name
        System.out.println("\nFinding Ticket by Movie Name 'Inception':");
        system.findByMovieName("Inception");

        // Find a ticket by customer name
        System.out.println("\nFinding Ticket by Customer Name 'Charlie':");
        system.findByCustomerName("Charlie");

        // Count total tickets
        System.out.println("\nCounting total tickets:");
        system.calculateCount();
    }

    public void addLast(Ticket t){
        if(head ==  null){
            head = new Node(t);
            tail = head;
            return;
        }

        Node n = new Node(t);

        tail.next = n;
        n.next = head;
        tail = n;

    }

    public void removeById(int id){
        Node curr = head;
        Node prevCurr = tail;
        while(curr != tail){
            if(curr.data.getId() == id){
                prevCurr.next = curr.next;
                return;
            }
            curr = curr.next;
            prevCurr = prevCurr.next;
        }

        System.out.println("No Movie found!!");
    }

    public void display(){
        Node curr = head;

        while(curr.next != head){
            System.out.println(curr.data);
            curr = curr.next;
        }

        System.out.println("HEAD");
    }

    public void findByMovieName(String movie){
        if(head.data.getMovieName().equals(movie)){
            System.out.println("Ticket Found");
            System.out.println(head.data);
            return;
        }

        if(tail.data.getMovieName().equals(movie)){
            System.out.println("Ticket Found");
            System.out.println(tail.data);
            return;
        }

        Node curr = head.next;
        while(curr.next!=tail){
            if(curr.data.getMovieName().equals(movie)){
                System.out.println("Ticket Found");
                System.out.println(curr.data);
                return;
            }
        }

        System.out.println("No ticket found");
    }

    public void findByCustomerName(String customer){
        if(head.data.getMovieName().equals(customer)){
            System.out.println("Ticket Found");
            System.out.println(head.data);
            return;
        }

        if(tail.data.getMovieName().equals(customer)){
            System.out.println("Ticket Found");
            System.out.println(tail.data);
            return;
        }

        Node curr = head.next;
        while(curr.next!=tail){
            if(curr.data.getMovieName().equals(customer)){
                System.out.println("Ticket Found");
                System.out.println(curr.data);
                return;
            }
        }

        System.out.println("No ticket found");
    }

    public void calculateCount(){
        Node curr = head;
        int c = 0;
        while(curr.next != head){
            curr = curr.next;
            c++;
        }

        System.out.println("Total count: " + c);
    }

}
