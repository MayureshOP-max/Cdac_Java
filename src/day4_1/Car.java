package day4_1;

public class Car implements Cloneable{
    private String make;
    private String model;
    private int price;
    public Car(String make,String model,int price){
        this.make = make;
        this.model = model;
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        Car other = (Car)o;
        if(this.make.equals(other.make) && this.model.equals(other.model) && this.price == other.price)
            return true;
        else
            return false;
    }
    public Object clone(){
        return new Car(this.make,this.model,this.price);
    }
}
