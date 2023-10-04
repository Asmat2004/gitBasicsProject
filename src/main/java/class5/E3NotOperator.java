package class5;

import java.util.Scanner;

public class E3NotOperator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please enter the name of the country");
        String country=input.nextLine();

        if ( !country.equals("Iran")){
            System.out.println("Welcome you are allowed ");
        }
        if ( !country.equalsIgnoreCase("Iran")){ //this code is the one that ignores the uppercase and lowercase of something
            System.out.println("Welcome you are allowed ");
        }

    }
}
