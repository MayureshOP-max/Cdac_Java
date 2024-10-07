package day4_1;

import day3.SalariedEmployee;

public class Printer {
    public void printData(Printable p){
        p.print();
    }
    public static void main(String[] args) {
        Printer p = new Printer();
        Book b = new Book("Head first java",20);
        p.printData(b);

        SalariedEmployee e = new SalariedEmployee(21,"aaa", 900000);
        p.printData((Printable) e);
    }
}
