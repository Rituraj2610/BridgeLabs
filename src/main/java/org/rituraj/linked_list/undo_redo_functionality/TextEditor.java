package org.rituraj.linked_list.undo_redo_functionality;

import org.w3c.dom.Text;

public class TextEditor {
    Node head;
    Node tail;
    Node curr;
    int size;
    static int MAX_SIZE = 10;
    TextEditor(){
        head = null;
        tail = null;
        curr = null;
        size = 0;
    }

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        // Adding 10 strings
        textEditor.addText("State 1");
        textEditor.addText("State 2");
        textEditor.addText("State 3");
        textEditor.addText("State 4");
        textEditor.addText("State 5");
        textEditor.addText("State 6");
        textEditor.addText("State 7");
        textEditor.addText("State 8");
        textEditor.addText("State 9");
        textEditor.addText("State 10");

        // Display the current state
        System.out.println("Current state:");
        textEditor.displayCurrentState();

        // Add 2 more strings
        textEditor.addText("State 11");
        textEditor.addText("State 12");

        // Display the entire list
        System.out.println("\nFull list of states:");
        textEditor.displayList();

        // Perform undo 5 times and display current state
        System.out.println("\nPerforming undo 5 times:");
        for (int i = 0; i < 5; i++) {
            textEditor.undo();
        }
        textEditor.displayCurrentState();

        // Perform redo 2 times and display current state
        System.out.println("\nPerforming redo 2 times:");
        for (int i = 0; i < 2; i++) {
            textEditor.redo();
        }
        textEditor.displayCurrentState();

        // Add a new state and try to redo again
        System.out.println("\nAdding a new state and attempting redo:");
        textEditor.addText("State 13");
        textEditor.redo(); // This should fail since redo history is lost
        textEditor.displayCurrentState();

        // Display the final full list to check the state
        System.out.println("\nFinal full list of states:");
        textEditor.displayList();
    }

    public void addText(String str){
        if(head == null){
            head = new Node(str);
            curr = head;
            tail = head;
            return;
        }

        // if we already had states in front
        if(curr.next != null){
            Node temp = curr;
            int lostState = 0;
            while(temp.next != null){
                lostState++;
                temp = temp.next;
            }

            size -= lostState;
        }

        Node n = new Node(str);
        curr.next = n;
        n.prev = curr;
        curr = n;
        tail = n;

        if(size == MAX_SIZE){
            head = head.next;
            head.prev = null;
        }else{
            size++;
        }
    }

    public void displayCurrentState(){
        System.out.println(curr.data);
    }

    public void undo(){
        if(curr!=null && curr.prev != null){
            curr = curr.prev;
        }else{
            System.out.println("No state available");
        }
    }

    public void redo(){
        if(curr!=null && curr.next != null){
            curr = curr.next;
        }else{
            System.out.println("No state available");
        }
    }

    public void displayList(){
        Node temp = head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
