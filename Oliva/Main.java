package Oliva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add product name: ");
        String prodName = sc.next();
        product.addProductName(new ProductName(prodName));

        System.out.println("Add product id: ");
        int prodId = sc.nextInt();
        product.addProductID(new ProductID(prodId));

        System.out.println("Add product description: ");
        String prodDesc = sc.next();
        product.addProductDesc(new ProductDesc(prodDesc));

        System.out.println("Add product id: ");
        int prodQty = sc.nextInt();
        product.addProductQty(new ProductQty(prodQty));


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
