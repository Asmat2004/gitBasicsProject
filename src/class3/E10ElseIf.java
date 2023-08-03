package class3;

public class E10ElseIf {
    public static void main(String[] args) {


        String fruit="apple";

        if (fruit.equals("mango")){
            System.out.println("Price is $5");
        }else if(fruit.equals("orange")) {
            System.out.println("Price is $4");
        }else if (fruit.equals("apple")) {
            System.out.println("Price is $1000");
        } else if(fruit.equals("kiwi")){
            System.out.println("$6");
        }else {
            System.out.println("This fruit is not available right now");
        }

    }
}
