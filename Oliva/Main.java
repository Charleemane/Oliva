package Oliva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add product name: ");
        String prodName = sc.next().toLowerCase();
        product.addProductName(new ProductName(prodName));

        System.out.println("Add product id: ");
        int prodId = sc.nextInt();
        product.addProductID(new ProductID(prodId));

        System.out.println("Add product description: ");
        sc.next();
        String prodDesc = sc.next().toLowerCase();
        product.addProductDesc(new ProductDesc(prodDesc));

        System.out.println("Add product quantity: ");
        int prodQty = sc.nextInt();
        product.addProductQty(new ProductQty(prodQty));

        product.productDetails();

        System.out.println("Remove a product(name): ");
        prodName = sc.next().toLowerCase();
        product.removeProduct(new Product(prodName));

        sc.close();
    }
}
