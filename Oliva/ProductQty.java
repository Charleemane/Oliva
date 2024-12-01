package Oliva;

public class ProductQty extends ProductDetail{

    public ProductQty (int qty) {
        super(qty);
    }

    public void displayInfo() {
        System.out.println("Product name is " + super.getInt() + ".");
    }
}
