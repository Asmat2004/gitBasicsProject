package class12;

import java.util.Scanner;

public class E1Methods {

    public static void main(String[] args) {

        takeUserInput();






    }
    static void takeUserInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name= scanner.nextLine();
        System.out.println("please enter your age ");
        int age= scanner.nextInt();

        System.out.println("your name is "+name+" and you are "+age+" years old");
    }


}
