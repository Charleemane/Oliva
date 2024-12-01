package Oliva;

import java.util.Vector;

public class ProductID extends ProductDetails{

    private Vector<ProductID> productID = new Vector<>();

    public void addProductID(ProductID id) {
        productID.add(id);
        System.out.println(id + "has been addded.");
    }

    public void displayID() {
        System.out.println("Product ID is " + productID);
    }
}
