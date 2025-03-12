package org.rituraj.linked_list.round_robin_implementation;


public class RoundRobin {

    Node head;
    static int FIXED_TIME_QUANTUM = 10;

    RoundRobin(){
        head = null;
    }

    public static void main(String[] args) {
        RoundRobin scheduler = new RoundRobin();

        // Create 10 sample processes
        scheduler.insertLast(new Process(1, 25, 1));
        scheduler.insertLast(new Process(2, 15, 3));
        scheduler.insertLast(new Process(3, 10, 2));
        scheduler.insertLast(new Process(4, 35, 1));
        scheduler.insertLast(new Process(5, 20, 2));
        scheduler.insertLast(new Process(6, 30, 3));
        scheduler.insertLast(new Process(7, 5, 1));
        scheduler.insertLast(new Process(8, 40, 2));
        scheduler.insertLast(new Process(9, 50, 3));
        scheduler.insertLast(new Process(10, 45, 1));

        // Run the scheduler
        scheduler.runScheduler();
    }

    public void insertLast(Process t){
        if(head == null){
            head = new Node(t);
            return;
        }

        Node n = new Node(t);
        Node curr = head;

        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = n;
        n.next = head;
    }

    public void runScheduler(){
        Node curr = head;
        Node prevCurr = head;

        while(prevCurr.next != head){
            prevCurr = prevCurr.next;
        }

        int i = 0;

        while(prevCurr != curr){
            if(curr == head){
                i++;
                System.out.println("Round: " + i);
            }
            System.out.println(curr.data);
            if(curr.data.getBurstTime() <= FIXED_TIME_QUANTUM){
                if(curr == head){
                    head = head.next;
                }
                prevCurr.next = curr.next;
                curr = prevCurr.next;
            }else{
                curr.data.setBurstTime(curr.data.getBurstTime() - FIXED_TIME_QUANTUM);
            }

            curr = curr.next;
            prevCurr = prevCurr.next;

        }
    }

}
