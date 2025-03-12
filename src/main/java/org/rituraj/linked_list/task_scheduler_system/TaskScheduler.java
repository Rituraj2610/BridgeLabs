package org.rituraj.linked_list.task_scheduler_system;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

public class TaskScheduler {
    Node head;
    Node currTask;

    TaskScheduler(){
        head = null;
        currTask = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        Task task1 = new Task(1, 1, "Prepare Report", LocalDate.of(2025, 3, 15));
        Task task2 = new Task(2, 2, "Team Meeting", LocalDate.of(2025, 3, 18));
        Task task3 = new Task(3, 3, "Code Review", LocalDate.of(2025, 3, 20));
        Task task4 = new Task(4, 8, "Client Follow-up", LocalDate.of(2025, 3, 22));
        Task task5 = new Task(5, 2, "Update Documentation", LocalDate.of(2025, 3, 25));
        Task task6 = new Task(6, 1, "Project Deadline", LocalDate.of(2025, 3, 30));


        scheduler.insertFirst(task1);
        scheduler.insertFirst(task2);

        scheduler.insertLast(task3);
        scheduler.insertLast(task4);

        scheduler.insertAtPosition(1, task5);
        scheduler.insertAtPosition(3, task6);

        System.out.println("All tasks after inserting:");
        scheduler.display();

        System.out.println("\nDeleting task with ID 3...");
        scheduler.deleteById(3);

        System.out.println("\nAll tasks after deletion:");
        scheduler.display();

        System.out.println("\nSearching for tasks with priority 1...");
        scheduler.findByPriority(1);

        System.out.println("\nViewing current tasks:");
        scheduler.displayCurTask(sc);
    }


    public void insertFirst(Task t){
        if(head == null){
            head = new Node(t);
            return;
        }

        Node n = new Node(t);
        n.next = head;
        head.next = n;
        head = n;
    }

    public void insertLast(Task t){
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

    public void insertAtPosition(int i, Task t){
        if(i == 0){
            insertFirst(t);
            return;
        }

        Node n = new Node(t);

        int c = 0;
        Node curr = head;

        while(curr.next != head || c < i-1){
            curr = curr.next;
            c++;
        }

        n.next = curr.next;
        curr.next = n;
    }

    public void deleteById(int id){
        Node curr = head;
        if(head.data.getId() == id){
               while(curr.next != head){
                   curr = curr.next;
               }

               curr.next = head.next;
               head = head.next;

               return;
        }

        while(curr.next.data.getId() != id){
            curr = curr.next;
        }

        curr.next = curr.next.next;
    }

    public void display(){
        Node curr = head;
        while(curr.next != head){
            System.out.println(curr.data);
            System.out.println(" ==> ");
            curr = curr.next;
        }

        System.out.println("HEAD");
    }

    public void findByPriority(int priority){

        Node curr = head;
        int c = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(curr.next != head){
            if(curr.data.getPriority() == priority){
                hs.add(c);
            }
            curr = curr.next;
            c ++;
        }

        if(hs.isEmpty()){
            System.out.println("No task with given priority found!");
        }else{
            hs.forEach(System.out::println);
        }

    }

    public void displayCurTask(Scanner sc){
        if(head == null){
            System.out.println("Add a task !!");
            return;
        }
        if(currTask == null){
            currTask = head;
            System.out.println("Current Task is: " + currTask.data);
        }

        while (true){
            System.out.println("To view next task press 1 else press 0");
            int i = sc.nextInt();
            if(i == 1){
                currTask = currTask.next;
                System.out.println("Current Task is: " + currTask);
            }    else{
                return;
            }
        }

    }

}
