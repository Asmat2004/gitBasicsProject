package review3;

import java.util.Scanner;

public class E7DoWhile {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int x= 0;
        int sum =0;
        do{

            System.out.println("please Enter the Price of item or -1 to terminate ");
            x= scanner.nextInt();
            if (x!=-1)
            sum=sum+x;
            System.out.println("Your total bil is "+sum);
        }while(x !=-1);



    }
}
