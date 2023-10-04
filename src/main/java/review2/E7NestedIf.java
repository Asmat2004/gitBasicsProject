package review2;

public class E7NestedIf {
    public static void main(String[] args) {

        String day="Sunday";

        double accountBalance=5000;
        // ==equals()    != not-equals()
        if (day.equals("Sunday")){

            if (accountBalance>2000){
                System.out.println("We can buy this");
            }else {
                System.out.println("Lets save money");
            }


        }else {
            System.out.println("Lets wait for sunday");
        }










    }
}
