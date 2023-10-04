package Practice;

public class MessedupHW {
    public static void main(String[] args) {

        int [] num ={67,34,87,23,67};

        if (num[0]>num[1] &&num[0]> num[2]&&num[0]>num[3]&&num[0]>num[4]){
            System.out.println(num[0]);
        } else if (num[1]>num[0] &&num[1]> num[2]&&num[1]>num[3]&&num[1]>num[4]){
            System.out.println(num[1]);
        }else if (num[2]>num[0] &&num[2]> num[1]&&num[2]>num[3]&&num[2]>num[4]){
            System.out.println(num[2]);
        }else if (num[3]>num[0] &&num[3]> num[1]&&num[3]>num[2]&&num[3]>num[4]){
            System.out.println(num[3]);
        }else if (num[4]>num[0] &&num[4]> num[1]&&num[4]>num[2]&&num[4]>num[3]){
            System.out.println(num[4]);
        }else {
            System.out.println("None are bigger");
        }





    }
}
