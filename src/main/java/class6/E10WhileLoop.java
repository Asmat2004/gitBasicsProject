package class6;

import java.util.Scanner;

public class E10WhileLoop {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Please Enter the starting point");
        int start= scanner.nextInt();

        System.out.println("Please Enter ending point");
        int end=scanner.nextInt();

        System.out.println("Please Enter steps as well");
        int step= scanner.nextInt();

        while (start<=end) {
            if (start != 7) {
                System.out.println(start);
            }
            start+=step;
        }




    }
}
