package Practice;

import java.util.Scanner;

public class HW31 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Is it sunny outside put true or false");
        boolean weather = input.nextBoolean();


        if (weather) {
            System.out.println("It is a sunny day,I should go somewhewre");
            System.out.println("what is the temprature outside");
            int temp = input.nextInt();

            if (temp >= 85) {
                System.out.println(" iam going to beach");
            } else {
                System.out.println(" I am going to the park");
            }

             }else{
                System.out.println(" I stay hone and practice java");
            }



    }
}