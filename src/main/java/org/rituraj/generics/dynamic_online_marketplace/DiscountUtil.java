package org.rituraj.generics.dynamic_online_marketplace;

// Generic method to apply discount
class DiscountUtil {
    public static <T extends Product<? extends ProductCategory>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * (percentage / 100));
        product.setPrice(discountedPrice);
        System.out.println("Discount applied! New price of " + product.getName() + ": $" + discountedPrice);
    }
}
