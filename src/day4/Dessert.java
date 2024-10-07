package day4;

public abstract class Dessert {
    protected String pname;
    protected double price;

    public Dessert(String pname, double price) {
        this.pname = pname;
        this.price = price;

    }
    public abstract double calculatePrice();

    public String toString()
    {
        return "Dessert Name: " + this.pname + " ,Price-"+ this.price;
    }
}
