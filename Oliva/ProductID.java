package Oliva;

import java.util.Vector;

public class ProductID extends ProductDetail{

    public ProductID (int id) {
        super(id);
    }

    public void addProductID(ProductID id) {
        productID.add(id);
        System.out.println(id + "has been addded.");
    }

    public void displayID() {
        System.out.println("Product ID is " + productID);
    }
}
