package Oliva;

import java.util.ArrayList;

public class Product {

    private ArrayList<Product> products;

    public Product() {
        products = new ArrayList<>();
    }

    //for removeProduct
    public Product(String name) {}

    public void addProductName(Product name) {
        products.add(name);
        System.out.println("The product has been addded.");
    }

    public void addProductID(Product id) {
        products.add(id);
    }

    public void addProductDesc(Product desc) {
        products.add(desc);
    }

    public void addProductQty(Product qty) {
        products.add(qty);
    }

    /*public void searchProduct(Product name) {
        boolean isFound = false;
        int index = -1;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(name)) {
                isFound = true;
                index = i;
                break;
            }
        }

        if (isFound) {
            Product foundItem = products.get(index);
            System.out.println(name + " is found with " + "the quantity: " + foundItem);
        } else {
            System.out.println(name + " item was not found.");
        }
    }*/

    /*public void removeProduct(String name) {
        boolean isFound = false;
        int index = -1;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(name)) {
                isFound = true;
                index = i;
                break;
            }
        }

        if (isFound) {
            Product foundItem = products.get(index);

            for (Product i: products) {
                products.remove(foundItem);
            }

            System.out.println("Product removed.");
        } else {
            System.out.println("Product not found.");
        }
    }*/

    public void removeProduct(Product name) {
        int index;
        boolean isFound = false;

        for (Product i: products) {
            products.equals(name);
            isFound = true;
            break;
        }

        if (isFound) {
            index = products.indexOf(name);

            for (Product i: products) {
                products.remove(index);
            }

            System.out.println("Product removed.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayInfo() {
        System.out.println("");
    }

    //method to call displayInfo method in child classes
    public void productDetails() {
        for (Product i: products) {
            i.displayInfo();
        }
    }
}