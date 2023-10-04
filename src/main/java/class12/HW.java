package class12;

import java.util.Scanner;

public class HW {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("write a word");
        String str= scanner.next();

        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));

        }
        System.out.println();
        if (str.length() !=str.length()-1){
            System.out.println("not p");
        }


}
}
