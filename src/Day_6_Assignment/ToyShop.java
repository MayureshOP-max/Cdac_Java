package Day_6_Assignment;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class ToyShop {
    private List<Toy> stock;

    public ToyShop() {
        stock = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        stock.add(toy);
    }

    public List<Toy> getAllToys() {
        return stock;
    }
    public List<Toy> filterByCategory(String category) {
        List<Toy> filtered = new ArrayList<>();
        for (Toy toy : stock) {
            if (toy.getCategory().equalsIgnoreCase(category)) {
                filtered.add(toy);
            }
        }
        return filtered;
    }

    public Toy searchToyByProductId(String productId) {
        int left = 0, right = stock.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            Toy midToy = stock.get(mid);
            if (midToy.getProductId().equals(productId)) {
                return midToy;
            } else if (midToy.getProductId().compareTo(productId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public List<Toy> listToysByPriceRange(double minPrice, double maxPrice) {
        List<Toy> result = new ArrayList<>();
        for (Toy toy : stock) {
            if (toy.getPrice() >= minPrice && toy.getPrice() <= maxPrice) {
                result.add(toy);
            }
        }
        return result;
    }

    public List<Toy> listToysForSpecificAge(int age) {
        List<Toy> result = new ArrayList<>();
        for (Toy toy : stock) {
            if (toy.getAge() == age) {
                result.add(toy);
            }
        }
        return result;
    }

    public List<Toy> listOldStock(int currentYear) {
        List<Toy> result = new ArrayList<>();
        for (Toy toy : stock) {
            if (currentYear - toy.getPurchaseYear() > 1) {
                result.add(toy);
            }
        }
        return result;
    }

    public void groupToysByCategory() {

    }
}



