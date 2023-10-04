package class4;

public class T2 {
    public static void main(String[] args) {

        double mortgageRate =4.1;
        double mortgagePrice= 40000;

        if (mortgageRate>4.5){
            System.out.println("user will not buy the house ");
        }else {
            System.out.println("user will buy a house ");
            if (mortgagePrice>50000){
                System.out.println("user will take a loan ");
            } else {
                System.out.println("user will pay cash ");
            }

        }






    }
}
