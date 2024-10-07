package day4_1;

public interface Writable {
    void write();
    default void foo(){
        System.out.println("this is a deafault method");
    }
}
