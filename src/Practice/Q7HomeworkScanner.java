package Practice;

import java.util.Scanner;

public class Q7HomeworkScanner {
    public static void main(String[] args) {

        System.out.println("Please enter first number");
        Scanner scanner =new Scanner (System.in);
        double num1 = scanner.nextDouble();
        System.out.println("Please enter second number" );
        double num2= scanner.nextDouble();

        double results=(num1*num2);
        System.out.println(results);

        if ( results>0){
            System.out.println("True");
        }else if   (results<0){
            System.out.println("False");
        }






    }
}
