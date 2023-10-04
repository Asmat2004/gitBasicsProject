package Practice;

public class HW117 {
    public void evenSumX(int X){
        int total=0;
        for (int i = 0; i <=X ; i++) {
            if(i %2==0){
               total=i+total;
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
       HW117 q1=new HW117();
       q1.evenSumX(5);
    }

}





