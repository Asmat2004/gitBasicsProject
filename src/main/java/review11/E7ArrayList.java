package review11;

import java.util.ArrayList;

public class E7ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");  //0
        fruit.add("Mango");  //1
        fruit.add("orange");  //2
        fruit.add("Kiwi");  //3
        fruit.add("Banana");  //4
        fruit.add("Cherry");  //5

        fruit.replaceAll(x->{

            if (x.contains("a")){
                return "Water";
            } else{
                return x;
            }
        });
        System.out.println(fruit);











    }
}
