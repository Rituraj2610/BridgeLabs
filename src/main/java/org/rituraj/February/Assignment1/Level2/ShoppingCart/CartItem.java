package org.rituraj.February.Assignment1.Level2.ShoppingCart;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + getTotalCost());
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Laptop", 800, 2);
        cart.displayCart();
    }
}

