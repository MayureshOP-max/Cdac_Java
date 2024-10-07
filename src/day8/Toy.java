package day8;

import java.time.LocalDate;

public class Toy {
    private int productId;
    private String name;
    private double price;
    private String category;
    private int age;
    private LocalDate purchaseDate;

    public Toy(int productId, String name, double price, int age, String category, LocalDate purchaseDate) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.age = age;
        this.category = category;
        this.purchaseDate = purchaseDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", age=" + age +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
