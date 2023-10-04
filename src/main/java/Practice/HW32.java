package Practice;

import java.util.Scanner;

public class HW32 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter your gender M or F");
        String gender=scanner.next();
        System.out.println("please enter your age");
        int age= scanner.nextInt();

        if (age>25){
            if (gender.equalsIgnoreCase("f")){
                System.out.println("woman");
            } else{
                System.out.println("male");
            }
        }  if (age<25){
            if(gender.equalsIgnoreCase("f")){
                System.out.println("girl");
            } else{
                System.out.println("boy");
            }
        }


    }
}