package Oliva;

import java.util.Vector;

public class ProductDesc extends ProductDetail {

    public ProductDesc (String desc) {
        super(desc);
    }
    public void addProductDesc(ProductDesc desc) {
        productDesc.add(desc);
        System.out.println(desc + "has been addded.");
    }

    public void displayDesc() {
        System.out.println("Product description is " + productDesc);
    }
}
