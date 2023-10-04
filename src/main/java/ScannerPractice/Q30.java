package ScannerPractice;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {

        System.out.println("Please enter month number");
        Scanner scanner =new Scanner (System.in);
        int mnth = scanner.nextInt();

        if (mnth == 1){
            System.out.println("January");
        } else if (mnth==2){
            System.out.println("February");
        }else if (mnth==3){
            System.out.println("March");
        }else if (mnth==4){
            System.out.println("April");
        }else if (mnth==5){
            System.out.println("May");
        }else if (mnth==6){
            System.out.println("June");
        }else if (mnth==7){
            System.out.println("July ");
        }else if (mnth==8){
            System.out.println("August");
        }else if (mnth==9){
            System.out.println("September");
        }else if (mnth==10){
            System.out.println("October");
        }else if (mnth==11){
            System.out.println("November");
        }else if (mnth==12){
            System.out.println("December");
        } else{
            System.out.println("Invalid");
        }










    }
}
