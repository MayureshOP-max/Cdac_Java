package day9_handson;

public class PrintThread extends Thread {
    private MyArray myArray;
    public PrintThread(MyArray myArray) {
        this.myArray = myArray;
    }
    public void run() {
        myArray.printArray();
    }
}
