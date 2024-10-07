package Day_6_Assignment;

public class Toy {
    private String productId;
    private String name;
    private double price;
    private String category;
    private int age; // Suitable age for the toy
    private int purchaseMonth;
    private int purchaseYear;

    public Toy(String productId, String name, double price, String category, int age, int purchaseMonth, int purchaseYear) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.age = age;
        this.purchaseMonth = purchaseMonth;
        this.purchaseYear = purchaseYear;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public int getAge() { return age; }
    public int getPurchaseMonth() { return purchaseMonth; }
    public int getPurchaseYear() { return purchaseYear; }

    @Override
    public String toString() {
        return "Toy [ID=" + productId + ", Name=" + name + ", Price=" + price + ", Category=" + category + ", Age=" + age + "]";
    }
}
