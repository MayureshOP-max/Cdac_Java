package day4;

public class IceCream extends Dessert{
    protected double quantity;

    public IceCream(String pname,double price,double quantity) {
        super(pname, price);
        this.quantity = quantity;
    }
    @Override
    public double calculatePrice() {
        return price * quantity;
    }
}
