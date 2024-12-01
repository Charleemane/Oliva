package Oliva;

public class ProductName extends ProductDetail{

    public ProductName (String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Product name is " + super.getString() + ".");
    }
}
