package Practice;

public class HW116 {

        public void evenOROdd(int num, int num2){
           if(num %2==0 && num2 %2==1  ){
               System.out.println("false");
           }else if (num %2==0 && num2 %2==0){
               System.out.println("true");
           } else {
               System.out.println("false");
           }
       }

    public static void main(String[] args) {
         HW116 q1=new HW116();
         q1.evenOROdd(2,8);

    }
}





