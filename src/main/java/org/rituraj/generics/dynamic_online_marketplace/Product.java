package org.rituraj.generics.dynamic_online_marketplace;

// Generic Product class
class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public T getCategory() { return category; }

    @Override
    public String toString() {
        return "Product{Name: '" + name + "', Price: $" + price + ", Category: " + category.getClass().getSimpleName() + "}";
    }
}
