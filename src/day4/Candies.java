package day4;

public class Candies extends Dessert {
    protected double quantity;

    public Candies(String pname,double price,double quantity) {
        super(pname, price);
        this.quantity = quantity;
    }
    @Override
    public double calculatePrice() {

        return price * (quantity /1000);
    }
}
