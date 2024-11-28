package Oliva;

import java.util.Vector;

public class Item {

    private Vector<Item> inventory = new Vector<>();

    public void addItem(Item name, int quantity) {
        this.inventory.add(quantity, name);
    }

    public void searchItem(String itemName) {
        boolean isFound = false;
        int index = -1;

        for (int i = 0; i < this.inventory.size(); i++) {
            if (this.inventory.get(i).equals(itemName)) {
                isFound = true;
                index = i;
                break;
            }
        }

        if (isFound) {
            Item foundItem = inventory.get(index);
            System.out.println(itemName + " is found with " + "the quantity: " + foundItem.quantity);
        } else {
            System.out.println(itemName + " item was not found.");
        }
    }

}