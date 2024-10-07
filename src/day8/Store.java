package day8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Toy> initializeToyData(){
        List<Toy> toylist = new ArrayList<>();

        toylist.add(new Toy(38,"Lego Bricks",20050,7,"Sports", LocalDate.of(2022, 5, 10)));
        toylist.add(new Toy(50, "Rubik's Cube", 550000,12, "Alphabets", LocalDate.of(2021, 3, 15)));
        toylist.add(new Toy(65, "cccBarbie Doll", 95000,18, "Musicals", LocalDate.of(2024, 1, 20)));
        toylist.add(new Toy(78, "Hot Wheels Car", 2550,3, "Miscellaneous", LocalDate.of(2020, 6, 5)));
        toylist.add(new Toy(91,"Teddy Bear",8530,7,"Sports", LocalDate.of(2022, 5, 10)));
        toylist.add(new Toy(52, "Nerf Gun", 30090,12, "Alphabets", LocalDate.of(2019, 3, 15)));
        toylist.add(new Toy(62, "Play-Doh", 45600,18, "Musicals", LocalDate.of(2024, 7, 20)));
        toylist.add(new Toy(71, "Action Figure", 1200,3, "Miscellaneous", LocalDate.of(2020, 6, 15)));

        return toylist;
    }

    public static void main(String[] args) {
        Store store = new Store();
        Stock stock = new Stock();


        List<Toy> toylist=store.initializeToyData();
        System.out.println("=================Listing Stocks===================");
        stock.stockList(toylist);

        System.out.println("===================Filtering by category=====================");
        stock.filterToysCat(toylist,"Musicals");

        System.out.println("===================Filtering by price======================");
        stock.filterToysPrice(toylist);

        System.out.println("===================List of old stock======================");
        stock.listOld(toylist);

        System.out.println("===================Category counting======================");
        stock.countCategories(toylist);

        System.out.println("===================Minimum toy price======================");
        stock.minPrice(toylist);

        System.out.println("===================Maximum stock price======================");
        stock.maxPrice(toylist);

        System.out.println("===================Toys by age group======================");
        stock.groupByAge(toylist);

    }
}
