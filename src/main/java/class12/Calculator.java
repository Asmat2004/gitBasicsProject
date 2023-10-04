package class12;

import java.util.Scanner;

public class Calculator {

    public void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1= scanner.nextInt();
        System.out.println("Please enter second number");
        int num2= scanner.nextInt();
        int sum=num1+num2;
        System.out.println("sum of these numbers is "+sum);
    }
   public void subtract(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1= scanner.nextInt();
        System.out.println("Please enter second number");
        int num2= scanner.nextInt();
        int sum=num1-num2;
        System.out.println("sum of these numbers is "+sum);
    }
    public void multiply(int number1,int number2){

        int result=number1*number2;
        System.out.println(result);
    }
}
