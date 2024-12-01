package Oliva;

public class ProductQty extends ProductDetail{

    public ProductQty (int qty) {
        super(qty);
    }

    @Override
    public void displayInfo() {
        System.out.println("Product quantity is " + super.getInt() + ".");
    }
}
