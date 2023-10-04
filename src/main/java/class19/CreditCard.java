package class19;

public class CreditCard {

   public void calInterest(double balance){
       System.out.println(balance*0.05);
       }
   }

   class AX extends CreditCard{

    public void callInterest(double balance){
        System.out.println(balance*0.07);
    }
   }
