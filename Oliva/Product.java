package Oliva;

import java.util.ArrayList;

public class Product {

    private ArrayList<Product> products;
    protected String string;
    protected int integer;

    public Product(String NameOrDesc) {
        string = NameOrDesc;
    }

    public Product(int IdOrQty) {
        integer = IdOrQty;
    }

    public String getString() {
        return this.string;
    }

    public int getInt() {
        return this.integer;
    }

    public Product() {
        products = new ArrayList<>();
    }

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

    public void searchProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getString().equalsIgnoreCase(name)) {
                System.out.println("Product " + name + " found.");
                break;
            } else {
                System.out.println("Product not found.");
            }
        }
    }

    public void removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getString().equalsIgnoreCase(name)) {
                int index = i;
                for (int j = index; j < index + 4; j++) {
                    products.remove(index);
                }
                break;
            } else {
                System.out.println("Product not found.");
            }
        }
    }

    public void displayInfo() {
        int integer;
        String string;

        if (products.size() != 0) {
            for (int i = 0; i < products.size(); i++) {
                integer = products.get(i).getInt();
                string = products.get(i).getString();

                if (integer == 0) {
                    System.out.println(string);
                } else {
                    System.out.println(integer);
                }
            }
        } else {
            System.out.println("No products found");
        }
    }
}