package Practice;

import java.util.Scanner;

public class ScannerHW {
    public static void main(String[] args) {


        System.out.println("Enter your Age");
        Scanner scanner=new Scanner(System.in);
        int age= Integer.parseInt(scanner.next());
        int age1=10;
        int results= age+age1;

        System.out.println("Your age after 10 years "+results);




    }
}
