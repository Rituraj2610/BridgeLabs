package org.rituraj.February.Assignment6.ECommercePlatform;

    import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            List<Product> products = new ArrayList<>();

            products.add(new Electronics(1, "Smartphone", 999.99));
            products.add(new Clothing(2, "T-Shirt", 29.99));
            products.add(new Groceries(3, "Apples", 5.99));

            for (Product product : products) {
                product.displayProductDetails();
                double discount = product.calculateDiscount();
                double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
                double finalPrice = product.getPrice() - discount + tax;
                System.out.println("Discount: $" + discount);
                System.out.println("Tax: $" + tax);
                System.out.println("Final Price: $" + finalPrice);
            }
        }


}
