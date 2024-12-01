package Oliva;

public class ProductID extends ProductDetail{

    public ProductID (int id) {
        super(id);
    }

    public void displayInfo() {
        System.out.println("Product name is " + super.getInt() + ".");
    }
}
