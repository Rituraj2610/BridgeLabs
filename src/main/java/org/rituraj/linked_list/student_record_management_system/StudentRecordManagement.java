package org.rituraj.linked_list.student_record_management_system;

public class StudentRecordManagement {

    Node head;

    StudentRecordManagement(){
        head = null;
    }

    public static void main(String[] args) {
        //adding sample students
        Student student1 = new Student(1, "Aryan Kumar", 20, 'A');
        Student student2 = new Student(2, "Sneha Gupta", 19, 'B');
        Student student3 = new Student(3, "Rohan Sharma", 21, 'A');
        Student student4 = new Student(4, "Priya Mehta", 18, 'C');
        Student student5 = new Student(5, "Aditya Singh", 22, 'B');

        StudentRecordManagement studentRecordManagement = new StudentRecordManagement();
        System.out.println("Inserting data");
        System.out.println();
        studentRecordManagement.insertFirst(student2);
        studentRecordManagement.insertFirst(student1);
        studentRecordManagement.insertLast(student3);
        studentRecordManagement.insertLast(student5);
        studentRecordManagement.insertAtIndex(student4, 3);
        studentRecordManagement.display();

        System.out.println("Deleting data");
        System.out.println();
        studentRecordManagement.deleteByRollNumber(3);
        studentRecordManagement.display();

        System.out.println("Searching data");
        System.out.println(studentRecordManagement.searchByRollNumber(4));
        System.out.println();

        System.out.println("Updating data");
        System.out.println();
        Student student6 = new Student(6, "Meera Chopra", 20, 'A');
        studentRecordManagement.updateByRollNumber(student6, 2);
        studentRecordManagement.display();
    }

    //insertion logic
    public void insertFirst(Student s){
        if(head == null){
            head = new Node(s);
            return;
        }

        Node n = new Node(s);
        n.next = head;
        head = n;
    }

    public void insertLast(Student s){
        if(head == null){
            head = new Node(s);
            return;
        }

        Node n = new Node(s);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = n;
    }

    public void insertAtIndex(Student s, int i){

        int c = 0;

        if(i == 0){
            insertFirst(s);
            return;
        }

        Node n = new Node(s);
        Node curr = head;
        while(c < i){

            curr = curr.next;
            c++;

            if(curr.next == null){
                insertLast(s);
                return;
            }
        }

        n.next = curr.next;
        curr.next = n;
    }

    // deletion logic
    public void deleteByRollNumber(int rollNumber){
        Node curr = head;

        if(head.data.getRollNumber() == rollNumber){
            head = head.next;
            return;
        }

        while(curr.next.data.getRollNumber() != rollNumber){
            curr = curr.next;
        }

        if(curr == null){
            System.out.println("No student found!");
        }else{

        curr.next = curr.next.next;
        }
    }

    // searching logic
    public int searchByRollNumber(int rollNumber){
        int c = 0;
        Node curr = head;
        while(curr.data.getRollNumber() != rollNumber){
            curr = curr.next;
            c++;
        }
        if(curr == null){
            System.out.println("No student found!");
            return -1;
        }else{

            return c;
        }


    }

    // updating logic
    public void updateByRollNumber(Student s, int rollNumber){
        Node curr = head;
        while(curr.data.getRollNumber() != rollNumber){
            curr = curr.next;
        }

        curr.data = s;
    }

    // display logic
    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            System.out.println("\t==>\t");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

}
