package Class5;

import java.util.Scanner;

public class T5Switch {
    public static void main(String[] args) {

        System.out.println("enter your county");
        Scanner scanner=new Scanner (System.in);
        String country=scanner.nextLine();
        country=country.toLowerCase(); //this makes all the country into lower case
        switch (country){


            case "america":
                System.out.println("English");
                break;
            case "afghanistan":
                System.out.println("Farsi");
                break;
            case "Egypt":
                System.out.println("Arabic");
            default:
                System.out.println("idk any other languages");




        }






    }
}
