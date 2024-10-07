package day9_handson;

public class MultiThreadedPrint {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        PrintThread thread1 = new PrintThread(myArray);
        PrintThread thread2 = new PrintThread(myArray);

        thread1.start();
        thread2.start();
    }
}
