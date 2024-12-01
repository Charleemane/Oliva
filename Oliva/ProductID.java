package Oliva;

public class ProductID extends ProductDetail{

    public ProductID (int id) {
        super(id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Product id is " + super.getInt() + ".");
    }
}
