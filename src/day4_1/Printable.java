package day4_1;

public interface Printable {
    void print();
    default void foo() {
        System.out.println("this is a deafault method");
    }
}
