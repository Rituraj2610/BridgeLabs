package org.rituraj.generics.dynamic_online_marketplace;

import java.util.ArrayList;
import java.util.List;

// Generic Product Catalog
class ProductCatalog {
    private List<Product<? extends ProductCategory>> products = new ArrayList<>();

    public void addProduct(Product<? extends ProductCategory> product) {
        products.add(product);
    }

    public List<Product<? extends ProductCategory>> getProducts() {
        return products;
    }
}
