package Oliva;

public class ProductDesc extends ProductDetail {

    public ProductDesc (String desc) {
        super(desc);
    }

    public void displayInfo() {
        System.out.println("Product name is " + super.getString() + ".");
    }
}
