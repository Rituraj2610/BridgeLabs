package org.rituraj.linked_list.inventory_management_system;

public class ItemManagement {

    Node head;

    ItemManagement(){
        head = null;
    }

    public static void main(String[] args) {
        //adding sample items
        Item item1 = new Item(1, "Notebook", 50, 20.5f);
        Item item2 = new Item(2, "Pen", 100, 10.0f);
        Item item3 = new Item(3, "Eraser", 70, 5.5f);
        Item item4 = new Item(4, "Marker", 40, 15.0f);
        Item item5 = new Item(5, "Ruler", 60, 12.75f);
        Item item6 = new Item(6, "Highlighter", 30, 25.0f);

        ItemManagement itemManagement = new ItemManagement();

        // 1. Add 2 items at the start
        itemManagement.insertFirst(item1);
        itemManagement.insertFirst(item2);

        // 2. Add 2 items at the last
        itemManagement.insertLast(item3);
        itemManagement.insertLast(item4);

        // 3. Add 2 items at specific indices
        itemManagement.insertAtIndex(item5, 2); // Insert at index 2
        itemManagement.insertAtIndex(item6, 4); // Insert at index 4

        System.out.println("After inserting items:");
        itemManagement.display();

        // 4. Remove one item by ID
        itemManagement.deleteById(3); // Removing item with ID 3
        System.out.println("\nAfter deleting item with ID 3:");
        itemManagement.display();

        // 5. Update an item by ID
        Item updatedItem = new Item(4, "Updated Marker", 50, 18.0f); // Updated item
        itemManagement.updateById(updatedItem, 4);
        System.out.println("\nAfter updating item with ID 4:");
        itemManagement.display();

        // 6. Search for an item by ID
        int searchIndex = itemManagement.searchById(5);
        if (searchIndex != -1) {
            System.out.println("\nItem with ID 5 found at index: " + searchIndex);
        }

        // 7. Display total inventory cost
        System.out.println("\nTotal inventory cost:");
        itemManagement.displayTotal();

        // 8. Sort by price in ascending order and display
        itemManagement.sortByPriceAsc();
        System.out.println("\nSorted by price (ascending):");
        itemManagement.display();

        // 9. Sort by price in descending order and display
        itemManagement.sortByPriceDesc();
        System.out.println("\nSorted by price (descending):");
        itemManagement.display();

        // 10. Sort by name in ascending order and display
        itemManagement.sortByNameAsc();
        System.out.println("\nSorted by name (ascending):");
        itemManagement.display();

        // 11. Sort by name in descending order and display
        itemManagement.sortByNameDesc();
        System.out.println("\nSorted by name (descending):");
        itemManagement.display();

    }

    //insertion logic
    public void insertFirst(Item s){
        if(head == null){
            head = new Node(s);
            return;
        }

        Node n = new Node(s);
        n.next = head;
        head = n;
    }

    public void insertLast(Item s){
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

    public void insertAtIndex(Item s, int i){

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
    public void deleteById(int id){
        Node curr = head;

        if(head.data.getId() == id){
            head = head.next;
            return;
        }

        while(curr.next.data.getId() != id){
            curr = curr.next;
        }

        if(curr == null){
            System.out.println("No item found!");
        }else{

        curr.next = curr.next.next;
        }
    }

    // searching logic
    public int searchById(int id){
        int c = 0;
        Node curr = head;
        while(curr.data.getId() != id){
            curr = curr.next;
            c++;
            if(curr == null){
                System.out.println("No student found!");
                return -1;

        }

        }

            return c;
        }


    // updating logic
    public void updateById(Item s, int id){
        Node curr = head;
        while(curr.data.getId() != id){
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

    public void displayTotal(){
        float cost  = 0;
        Node curr = head;

        while(curr != null){
            cost += curr.data.getQuantity() * curr.data.getPrice();
            curr = curr.next;
        }

        System.out.println("Cost: " + cost);
    }

    public void sortByPriceAsc(){
        Node curr = head;

        while(curr != null){
            Node index = curr.next;
            while(index != null){
                if(curr.data.getPrice() > index.data.getPrice()){
                    Item temp = curr.data;
                    curr.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            curr = curr.next;
        }
    }

    public void sortByPriceDesc(){
        Node curr = head;

        while(curr != null){
            Node index = curr.next;
            while(index != null){
                if(curr.data.getPrice() < index.data.getPrice()){
                    Item temp = curr.data;
                    curr.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            curr = curr.next;
        }
    }

       public void sortByNameAsc(){
        Node curr = head;

        while(curr != null){
            Node index = curr.next;
            while(index != null){
                int i = curr.data.getItemName().compareTo(index.data.getItemName());
                if(i > 0){
                    Item temp = curr.data;
                    curr.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            curr = curr.next;
        }
    }

    public void sortByNameDesc(){
        Node curr = head;

        while(curr != null){
            Node index = curr.next;
            while(index != null){
                int i = curr.data.getItemName().compareTo(index.data.getItemName());
                if(i < 0){
                    Item temp = curr.data;
                    curr.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            curr = curr.next;
        }
    }
}
