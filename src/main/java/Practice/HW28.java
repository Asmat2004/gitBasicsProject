package Practice;

import java.util.Scanner;

public class HW28 {
    public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter a length");
        double length= scanner.nextDouble();
        System.out.println("please enter a width");
        double width= scanner.nextDouble();

        if (length>width){
            System.out.println("your shape is a rectangle");
        } else if (width<length){
            System.out.println("your shape is a rectangle");
        } else {
            System.out.println("Your shape is a square");
        }




    }
}
