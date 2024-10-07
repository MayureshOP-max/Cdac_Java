package day2;

public class Car {
    private String make;
    private String model;
    private Date purchaseDate;

    public Car(String make,String model, Date purchaseDate)
    {
        this.make = make;
        this.model = model;
        this.purchaseDate = purchaseDate;
    }

    public String toString()
    {
        return "Car Make: "+make + ",Model: "+model + ",PurchaseDate "+purchaseDate;
    }

    public static void main(String[] args) {
        Car car = new Car("Honda","City",new Date(1,"Mar",2024));
        System.out.println(car);
    }
}
