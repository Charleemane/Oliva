package Oliva;

import java.util.Vector;

public class ProductQty extends ProductDetail{

    public ProductQty (int qty) {
        super(qty);
    }

    public void addProductQty(ProductQty qty) {
        productQty.add(qty);
        System.out.println(qty + "has been addded.");
    }

    public void displayQty() {
        System.out.println("Product quantity is " + productQty);
    }
}
