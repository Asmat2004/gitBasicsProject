package review9;

import java.util.Scanner;

public class PrintTester {

    public static void main(String[] args) {
        Printer p=new Printer();
        p.print();
        p.print(20);
        p.print(10,20,30,40,50);
        p.print(10,20,50);

        System.out.println(Math.abs(15));
        Scanner scanner=new Scanner(System.in);
        scanner.nextByte();
        scanner.nextByte(2);
        String str=String.valueOf(100);
        System.out.println(str);
    }
}
