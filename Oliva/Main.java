package Oliva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add product name: ");
        String prodName = sc.nextLine().toLowerCase();
        product.addProductName(new Product(prodName));

        System.out.println("Add product id: ");
        int prodId = sc.nextInt();
        product.addProductID(new Product(prodId));

        System.out.println("Add product description: ");
        sc.nextLine();
        String prodDesc = sc.nextLine().toLowerCase();
        product.addProductDesc(new Product(prodDesc));

        System.out.println("Add product quantity: ");
        int prodQty = sc.nextInt();
        product.addProductQty(new Product(prodQty));

        System.out.println("Add product name: ");
        sc.nextLine();
        prodName = sc.nextLine().toLowerCase();
        product.addProductName(new Product(prodName));

        System.out.println("Add product id: ");
        prodId = sc.nextInt();
        product.addProductID(new Product(prodId));

        System.out.println("Add product description: ");
        sc.nextLine();
        prodDesc = sc.nextLine().toLowerCase();
        product.addProductDesc(new Product(prodDesc));

        System.out.println("Add product quantity: ");
        prodQty = sc.nextInt();
        product.addProductQty(new Product(prodQty));

        product.displayInfo();

        System.out.println("Search for a product(name): ");
        prodName = sc.next().toLowerCase();
        product.searchProduct(prodName);

        System.out.println("Remove a product(name): ");
        prodName = sc.next().toLowerCase();
        product.removeProduct(prodName);

        product.displayInfo();

        sc.close();
    }
}