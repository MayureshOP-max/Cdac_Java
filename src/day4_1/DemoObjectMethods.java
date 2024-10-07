package day4_1;

public class DemoObjectMethods {

    public static void main(String[] args) {
        Car car1 = new Car("aaa", "bbb",100000)
        Car car2 = new Car("aaa", "bbb",100000)

        System.out.println(car1.equals(car2));

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

//        Car car3 = (Car) car1.clone();
//        car1.setPrice(800000);
//        car1.setModel("ccc");
//        System.out.println(car3);
    }
}
