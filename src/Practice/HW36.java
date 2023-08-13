package Practice;

import java.util.Scanner;

public class HW36 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two strings ");
        String word1 =scanner.nextLine();
        String word2 =scanner.nextLine();
        System.out.println("Please enter two numbers");
        int int1= scanner.nextInt();
        int int2= scanner.nextInt();

        if (int1==int2 && word1.equalsIgnoreCase(word2)){
            System.out.println("AND");
        } else if (int1 ==int2 || word1.equalsIgnoreCase(word2)){
            System.out.println("OR");
        } else if (int1 != int2 && word1 != word2){
            System.out.println("NONE");
        }




    }
}
