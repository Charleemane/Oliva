package Oliva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        //ProductID productID = new ProductID();
        //ProductQty productQty = new ProductQty();
        //ProductDesc productDesc = new ProductDesc();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add product name: ");
        String prodName = sc.next();
        product.addProduct(new ProductName(prodName));
        //productID.addProductID(productID);
        //productQty.addProductQty(productQty);
        //productDesc.addProductDesc(productDesc);

        //product.addProduct(product);
        //productID.addProductID(productID);
        //productQty.addProductQty(productQty);
        //productDesc.addProductDesc(productDesc);

        //product.addProduct(product);
        //productID.addProductID(productID);
        //productQty.addProductQty(productQty);
        //productDesc.addProductDesc(productDesc);

        /*
        for (int i = 0; i < product.Size(); i++) {
            product.displayName();
            //productID.displayID();
            //productQty.displayQty();
            //productDesc.displayDesc();
        }
        */
    }
}
