package class5;

import java.util.Scanner;

public class T3ANDOperator {
    public static void main(String[] args) {


        System.out.println("what is the number of the week day?");
        Scanner scanner = new Scanner(System.in);
        int weekDay = scanner.nextInt();

        if (weekDay == 1 || weekDay == 2 || weekDay == 3 || weekDay == 4 || weekDay == 5) {
            System.out.println("It is a weekday");
        } else if (weekDay == 6 || weekDay == 7) {
            System.out.println("Its the weekend");
        } else {
            System.out.println("Pick 1-7");
        }
/*
This is the && format
public static void main(String[] args) {
        System.out.println("which day of the week is this?");
        Scanner input=new Scanner(System.in);
        int weekday=input.nextInt();

        if(weekday>=1 && weekday<=5){
            System.out.println(" It is week day");

        }else if (weekday<=6 && weekday<=7){
            System.out.println("weekdend day");

        }else{
            System.out.println("invalid");
        }

    }
}
 */

    }
}
