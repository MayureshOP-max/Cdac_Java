package Day_6_Assignment;
import java.util.List;

public class ToyOperations {

    public void listAllToys(ToyShop inventory) {
        System.out.println("Listing all toys in stock:");
        for (Toy toy : inventory.getAllToys()) {
            System.out.println(toy);
        }
    }

    public void filterToysByCategory(ToyShop inventory, String category) {
        System.out.println("\nFiltering by category '" + category + "':");
        List<Toy> toys = inventory.filterByCategory(category);
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }

    public void searchToyByProductId(ToyShop inventory, String productId) {
        System.out.println("\nSearching for toy with ID '" + productId + "':");
        Toy foundToy = inventory.searchToyByProductId(productId);
        System.out.println(foundToy != null ? foundToy : "Toy not found.");
    }

    public void listToysByPriceRange(ToyShop inventory, double minPrice, double maxPrice) {
        System.out.println("\nToys within the price range " + minPrice + " to " + maxPrice + ":");
        List<Toy> toysInRange = inventory.listToysByPriceRange(minPrice, maxPrice);
        for (Toy toy : toysInRange) {
            System.out.println(toy);
        }
    }

    public void listToysForSpecificAge(ToyShop inventory, int age) {
        System.out.println("\nToys for age " + age + ":");
        List<Toy> toys = inventory.listToysForSpecificAge(age);
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }

    public void listOldToys(ToyShop inventory, int currentYear) {
        System.out.println("\nListing old stock (older than 1 year):");
        List<Toy> oldToys = inventory.listOldStock(currentYear);
        for (Toy toy : oldToys) {
            System.out.println(toy);
        }
    }

    public void groupToysByCategory(ToyShop inventory) {
        System.out.println("\nGrouping toys by category:");
        inventory.groupToysByCategory();
    }
}