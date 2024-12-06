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

//Experimental

    /*
    public Product(String string) {}
    public Product(int integer) {}

    public void addProdName(String name) {
        Product prodName = new Product(name);
        products.add(prodName);
    }

    public void addProdId(int id) {
        Product prodId = new Product(id);
        products.add(prodId);
    }

    public void addProdDesc(String desc) {
        Product prodDesc = new Product(desc);
        products.add(prodDesc);
    }

    public void addProdQty(int qty) {
        Product prodQty = new Product(qty);
        products.add(prodQty);
    }

    public void searchProd(String name) {
    }

    public void removeProd(String name) {
    }

    public void displayInfo () {
    }
    */





//Old snippets

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