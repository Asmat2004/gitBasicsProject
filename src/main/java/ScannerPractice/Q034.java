package ScannerPractice;

import java.util.Scanner;

public class Q034 {
    public static void main(String[] args) {

        System.out.println("Please enter your first numbers");
        Scanner scanner =new Scanner (System.in);
        double num1= scanner.nextDouble();
        System.out.println("Please enter your second numbers");
        double num2= scanner.nextDouble();
        System.out.println("Please enter your third numbers");
        double num3= scanner.nextDouble();


        if (num1 >num2 && num1>num3 ){
            System.out.println("The largest number is: "+num1);;
        }
        if (num2> num1 && num2 > num3){
            System.out.println("The largest number is: "+num2);;
        }
        if (num3> num1 && num3>num2){
            System.out.println("The largest number is: "+num3);
        }








    }
}
