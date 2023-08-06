package Class5;

import java.util.Scanner;

public class T2ANDOperator {
    public static void main(String[] args) {


        System.out.println("enter your height ");
        Scanner scanner =new Scanner (System.in);
        int height= scanner.nextInt();


        if (height<60){
            System.out.println("you are short buddy");
        } else if (height>=60 && height<72){
            System.out.println("your in the middle");
        } else{
            System.out.println("you are tall ");
        }



    }
}
