package Practice;

import java.util.Scanner;

public class FamilyNameScanner1 {
    public static void main(String[] args) {

        System.out.println("Enter Your name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();

        if (name.equals("Asmat")){
            System.out.println("Best looking child in the Ahmadi family ");
        } else if (name.equals("Sahel")){
            System.out.println("I don't know anything about dinosaurs ");
        } else if (name.equals("Sumaya")){
            System.out.println("Stop talking please and eat your food ");
        } else if (name.equals("Sayema")){
            System.out.println("Hello Baqil ");
        }else if (name.equals("Zarmina")){
            System.out.println("Number 1 MOM <3 ");
        }else if (name.equals("Habib")){
            System.out.println("Best driver in the house ");
        }else if (name.equals("Nabi")){
            System.out.println("Trouble maker ");
        }


    }
}
