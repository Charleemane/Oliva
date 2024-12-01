package Oliva;

import java.util.Vector;

public class ProductQty extends Product{

    private Vector<ProductQty> productQty = new Vector<>();

    public void addProductQty(ProductQty qty) {
        productQty.add(qty);
        System.out.println(qty + "has been addded.");
    }

    public void displayQty() {
        System.out.println("Product quantity is " + productQty);
    }
}
