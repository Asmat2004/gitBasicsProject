package Practice;

import java.util.Scanner;

public class HW38 {
    public static void main(String[] args) {

        System.out.println("Is it weekend? enter true or false ");
        Scanner scanner = new Scanner(System.in);
        boolean question = scanner.nextBoolean();

        if (question==true) {
            System.out.println("Today you will be learning Java");
        } else if (question !=true)
            System.out.println("Today you will be learning manual testing");



        /*
         System.out.println("Is it weekend? enter true or false ");
        Scanner scanner = new Scanner(System.in);
        String  question = scanner.next();

        if (question.equals("true")) {
            System.out.println("Today you will be learning Java");
        } else if (question.equals("false"))
            System.out.println("Today you will be learning manual testing");
         */
    }
    }
