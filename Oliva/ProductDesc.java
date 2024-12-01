package Oliva;

import java.util.Vector;

public class ProductDesc {

    private Vector<ProductDesc> productDesc = new Vector<>();

    public void addProductDesc(ProductDesc desc) {
        productDesc.add(desc);
        System.out.println(desc + "has been addded.");
    }

    public void displayDesc() {
        System.out.println("Product description is " + productDesc);
    }
}
