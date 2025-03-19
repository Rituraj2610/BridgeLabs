package org.rituraj.generics.dynamic_online_marketplace;

// Testing the implementation
public class OnlineMarketplace {
    public static void main(String[] args) {
        // Create products
        Product<BookCategory> book = new Product<>("Java Programming", 50, new BookCategory());
        Product<ClothingCategory> tshirt = new Product<>("Cool T-Shirt", 20, new ClothingCategory());
        Product<GadgetCategory> smartphone = new Product<>("Smartphone", 800, new GadgetCategory());

        // Add products to catalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(tshirt);
        catalog.addProduct(smartphone);

        // Display catalog
        System.out.println("Product Catalog:");
        for (Product<? extends ProductCategory> product : catalog.getProducts()) {
            System.out.println(product);
        }

        // Apply discounts
        System.out.println("\nApplying Discounts...");
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(tshirt, 15);
        DiscountUtil.applyDiscount(smartphone, 5);

        // Display updated catalog
        System.out.println("\nUpdated Product Catalog:");
        for (Product<? extends ProductCategory> product : catalog.getProducts()) {
            System.out.println(product);
        }
    }
}
