package Oliva;

abstract class ProductDetail {

    protected String string;
    protected int integer;

    public ProductDetail (String string) {
        this.string = string;
    }

    public ProductDetail (int integer) {
        this.integer = integer;
    }
}
