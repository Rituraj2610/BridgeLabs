package org.rituraj.generics.smart_warehouse_system;

public class Furniture extends WarehouseItem{
    private String material;
    private String dimensions;

    public Furniture(String name, double price, String material, String dimensions) {
        super(name, price);
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + "Furniture{" +
                "material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                '}';
    }
}
