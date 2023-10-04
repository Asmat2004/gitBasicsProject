package Practice;

import java.util.Scanner;

public class Q5HomeWorkScanner {
    public static void main(String[] args) {

        System.out.println("Please enter your age");
        Scanner scanner=new Scanner(System.in);
        double age= Double.parseDouble(scanner.next());

        if (age >= 18){
            System.out.println("You are eligible to vote ");
        } else if (age<=18){
            System.out.println("You are not eligible to vote ");
        }











    }
}
