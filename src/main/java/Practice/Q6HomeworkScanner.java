package Practice;

import java.util.Scanner;

public class Q6HomeworkScanner {
    public static void main(String[] args) {

        System.out.println("Please enter the length");
        Scanner scanner =new Scanner(System.in);
        double length= scanner.nextDouble();
        System.out.println("Please enter the width");
        double width= scanner.nextDouble();

        if (length==width)
        {
            System.out.println("Your shape is a Square ");
        } else if  (length>width){
            System.out.println("Your shape is a rectangle ");
        } else if (length < width) {
            System.out.println("Your shape is a rectangle ");
        }

        }







    }

