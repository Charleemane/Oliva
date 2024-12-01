package Oliva;

public class ProductDesc extends ProductDetail {

    public ProductDesc (String desc) {
        super(desc);
    }

    @Override
    public void displayInfo() {
        System.out.println("Product descripiton is " + super.getString() + ".");
    }
}
