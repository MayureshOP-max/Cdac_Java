package day9_handson;

public class MyArray {
    private char[] greeting = {'G', 'o', 'o', 'd', ' ', 'M', 'o', 'r', 'n', 'i', 'n', 'g'};
    public synchronized void printArray() {
        for (int i = 0; i < greeting.length; i++) {
            System.out.print(greeting[i]);
        }
        System.out.println(); // Print a new line after the array
    }

}
