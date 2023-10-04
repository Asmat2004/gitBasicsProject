package class10;

public class ProjectsPART7 {
    public static void main(String[] args) {


        int num1=0;
        int num2=1;
        int num3=0;


        for (int i = 1; i <=2 ; i++) {

            num3=num1+num2;
            System.out.println(num3);
            num1=num3+num2;
            System.out.println(num1);
            num2=num3+num1;
            System.out.println(num2);
        }

    }
}
