package Day_6_Assignment;

public class MainApp {
    public static void main(String[] args) {
        ToyShop inventory = new ToyShop();
        ToyOperations operations = new ToyOperations();

        inventory.addToy(new Toy("001", "Lego Set", 49.99, "Educational", 8, 5, 2024));
        inventory.addToy(new Toy("002", "Action Figure", 19.99, "Battery Operated", 5, 7, 2021));
        inventory.addToy(new Toy("003", "Teddy Bear", 9.99, "Soft Toy", 3, 3, 2020));
        inventory.addToy(new Toy("004", "Doll", 10.99, "Soft Toy", 5, 3, 2024));

        operations.listAllToys(inventory);

        operations.filterToysByCategory(inventory, "Educational");

        operations.searchToyByProductId(inventory, "002");

        operations.listToysByPriceRange(inventory, 10, 50);

        operations.listToysForSpecificAge(inventory, 5);

        operations.listOldToys(inventory, 2024);

        operations.groupToysByCategory(inventory);
    }
}

