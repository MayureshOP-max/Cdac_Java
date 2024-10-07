package day8;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stock {
        Stream<Toy> stream;
        public void stockList(List<Toy> toylist){
//        Listing the stock
            Stream<Toy> stream = toylist.stream();
            stream.forEach(System.out::println);
        }

        //Filtering Stock

        public void filterToysCat(List<Toy> toylist, String criteria){
            stream = toylist.stream();
            Predicate<Toy> t = (toy) ->{
                if(toy.getCategory().contains(criteria))
                    return true;
                else
                    return false;
            };
            stream.filter(t).forEach((v) -> System.out.println(v));
        }

        public void filterToysPrice(List<Toy> toyList){
            stream = toyList.stream();
            Predicate<Toy> t = (toy)->{
                if(toy.getPrice() >= 500 && toy.getPrice() <= 1000)
                    return true;
                else
                    return false;
            };
            stream.filter(t).forEach((n) -> System.out.println(n));
        }

        public void sortPrice(List<Toy> toyList){
            stream = toyList.stream();

            Comparator<Toy> bycat = Comparator.comparing(Toy::getCategory);
            Comparator<Toy> byprice = Comparator.comparing(Toy::getPrice).thenComparing(bycat);

            stream.sorted(byprice).forEach((n) -> System.out.println(n));
        }

        public void listOld(List<Toy> toyList){
            LocalDate oneYearAgo = LocalDate.now().minusYears(1);

            List<Toy> oldStock = toyList.stream()
                    .filter(toy -> toy.getPurchaseDate().isBefore(oneYearAgo))
                    .collect(Collectors.toList());
            oldStock.forEach(System.out::println);
        }

        public void countCategories(List<Toy> toyList){
            stream = toyList.stream();
            Map<String, List<Toy>> groupByCategory = stream.collect(Collectors.groupingBy(Toy::getCategory));
            groupByCategory.forEach((k,v)-> System.out.println(k+" : "+v.size()));
        }

        public void minPrice(List<Toy> toyList){
            stream = toyList.stream();
            Optional<Toy> minPrice = stream.min(Comparator.comparing(Toy::getPrice));
            if(minPrice.isPresent())
                System.out.println(minPrice.get());
        }

        public void maxPrice(List<Toy> toyList){
            stream = toyList.stream();
            Optional<Toy> maxPrice = stream.min(Comparator.comparing(Toy::getPrice));
            if(maxPrice.isPresent())
                System.out.println(maxPrice.get());
        }

        public void groupByAge(List<Toy> toyList){
            stream = toyList.stream();
            Map<Integer, List<Toy>> groupByAge = stream.collect(Collectors.groupingBy(Toy::getAge));
            groupByAge.forEach((k,v)-> System.out.println("for age group of " + k +" ,no. of toys:  "+v.size()));
        }




    }

