package Practice;

import java.util.Scanner;

public class HW25 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("its positive");
        }
        else if (num < 0) {
            System.out.println("its negative");
        }
        else   {
            System.out.println("it is 0");
        }


    }
}
