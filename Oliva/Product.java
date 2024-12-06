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
        int integer;

        for (int i = 0; i < products.size(); i++) {
            integer = products.get(i).getInt();

            if (integer == 0) {
                if (products.get(i).getString().equalsIgnoreCase(name)) {
                    System.out.println("Product " + name + " found.");
                    break;
                }
            }
            //do this until i reaches products.size

            //i reaches end of arraylist
            if (i == products.size()) {
                System.out.println("Product not found.");
            }
        }
    }

    public void removeProduct(String name) {
        int integer;

        for (int i = 0; i < products.size(); i++) {
            integer = products.get(i).getInt();

            if (integer == 0) {
                if (products.get(i).getString().equalsIgnoreCase(name)) {
                    int index = i;
                    for (int j = index; j < index + 4; j++) {
                        products.remove(index);
                    }
                    System.out.println("Product removed.");
                    break;
                }
            }

            if (i == products.size()) {
                System.out.println("Product not found.");
            }
        }
    }

    public void displayInfo() {
        int integer;
        String string;

        System.out.println();
        System.out.println("Product details (name, id, description, quantity):");
        System.out.println("==================================================");

        if (products.size() != 0) {
            for (int i = 0; i < products.size(); i++) {
                integer = products.get(i).getInt();
                string = products.get(i).getString();

                if (i % 4 == 0) {
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                }

                if (integer == 0) {
                    System.out.printf(string + " ");
                } else {
                    System.out.printf(integer + " ");
                }
            }
        } else {
            System.out.println("No products found");
        }

        System.out.println();
        System.out.println("==================================================");
    }
}