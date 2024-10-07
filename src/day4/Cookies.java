package day4;

public class Cookies extends Dessert{
    protected double quantity;

    public Cookies(String pname,double price,double quantity) {
        super(pname, price);
        this.quantity = quantity;
    }
    @Override
    public double calculatePrice() {
        return price * (quantity /12);
    }
}
