package class5;

import java.util.Scanner;

public class HomeworkCountry {
    public static void main(String[] args) {

        System.out.println("enter your county");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        country = country.toLowerCase(); //this makes all the country into lower case
        switch (country) {


            case "america":
                System.out.println("English");
                break;
            case "afghanistan":
                System.out.println("Farsi");
                break;
            case "egypt":
                System.out.println("Arabic");
                break;
            case "france":
                System.out.println("French");
                break;
            case "mexico":
                System.out.println("Spanish ");
                break;
            default:
                System.out.println("idk any other languages");
                break;


        }


    }
}
