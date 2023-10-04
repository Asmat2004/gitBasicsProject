package Practice;

import java.util.Scanner;

public class HW40 {
    public static void main(String[] args) {

        System.out.println("Enter name of the instructor");
        Scanner scanner=new Scanner(System.in);
        String instructor=scanner.next();



        switch (instructor){

            case "Asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            case "Moazzam":
                System.out.println("Will take care of SDLC Assignments");
                break;
            case "Weqas":
                System.out.println("Will take care of Selenium Assignments");
                break;
            case "Asel":
                System.out.println("Will take care of every Assignment");
                break;
            default:
                System.out.println("Invalid instructor selected ");


        }


    }
}
