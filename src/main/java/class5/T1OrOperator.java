package class5;

import java.util.Scanner;

public class T1OrOperator {
    public static void main(String[] args) {


        System.out.println("Please enter your birth month");
        Scanner scanner=new Scanner(System.in);
        String month= scanner.next();

        if (month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
            System.out.println("It is Spring time ");
        } else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("Augest")){
            System.out.println("Its summer time ");
        }else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
            System.out.println("It is Fall time");
        }else if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")){
            System.out.println("Its winter time");
        }





    }
}
