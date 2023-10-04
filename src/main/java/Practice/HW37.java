package Practice;

import java.util.Scanner;

public class HW37 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you thirsty enter true or false");
        boolean thirst= scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Are you sleepy enter true or false");
        boolean sleep= scanner.nextBoolean();
        scanner.nextLine();

        if (thirst==true && sleep==false){
            System.out.println("Looks like you need to drink water");
        } else if (thirst==true && sleep ){
            System.out.println("Looks like you need to drink coffee");
        }else if (thirst==false && sleep){
            System.out.println("Looks like you need to drink tea");
        } else {
            System.out.println(" Looks like you need to drink nothing");
        }
    }
}
