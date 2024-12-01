package Oliva;

import java.util.Vector;

public class Product {

    private Vector<Product> products = new Vector<>();

    public void addProduct(Product name) {
        products.add(name);
        System.out.println(name + "has been addded.");
    }

    public void searchProduct(Product name) {
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
    }

    public void displayName() {
        System.out.printf("%n");
        System.out.println("Product name is " + products);
    }

    public int Size() {
        int size = products.size();
        return size;
    }

    //method to call displayInfo method in child classes //Instead put this in main function
    /*public void productDetails() {
        for (int i = 0; i < products.size(); i++) {
            displayName();
            ProductID.displayID();
        }
    }*/
}