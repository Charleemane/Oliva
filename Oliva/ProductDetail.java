package Oliva;

abstract class ProductDetail extends Product{

    protected String string;
    protected int integer;

    public ProductDetail (String string) {
        this.string = string;
    }

    public ProductDetail (int integer) {
        this.integer = integer;
    }
}
