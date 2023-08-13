package Practice;

import java.util.Scanner;

public class HW35 {
    public static void main(String[] args) {

        System.out.println("Do you need a loan enter true or false");
        Scanner scanner=new Scanner(System.in);
        boolean loan= scanner.nextBoolean();


        if (loan==true){
            System.out.println("what is your credit score?");
            int credit=scanner.nextInt();

            if (credit<600) {
                System.out.println("The eligibility is Not eligible");
            } else if (credit>=600 && credit<=700){
                System.out.println("The eligibility is Maybe eligible");
            } else if (credit>=701 && credit<=800){
                System.out.println("The eligibility is Eligible");
            } else if (credit>=800){
                System.out.println("The eligibility is Definitely eligible");
            }
        }else {
            System.out.println("Unknown ");
        }


    }
}
