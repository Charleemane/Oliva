package Oliva;

import java.util.Vector;

public class Product {

    private Vector<Product> name = new Vector<>();

    public void addItem(Product name, int quantity) {
        this.name.add(quantity, name);
    }

    public void searchItem(Product itemName) {
        boolean isFound = false;
        int index = -1;

        for (int i = 0; i < this.name.size(); i++) {
            if (this.name.get(i).equals(itemName)) {
                isFound = true;
                index = i;
                break;
            }
        }

        if (isFound) {
            Product foundItem = name.get(index);
            System.out.println(itemName + " is found with " + "the quantity: " + foundItem);
        } else {
            System.out.println(itemName + " item was not found.");
        }
    }

}