package review11;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");  //0
        fruit.add("Mango");  //1
        fruit.add("orange");  //2
        fruit.add("Kiwi");  //3
        fruit.add("Banana");  //4
        fruit.add("Cherry");  //5

        fruit.set(2,"Grapes");  //replace element 2
        System.out.println(fruit);
        fruit.isEmpty();
        System.out.println(fruit.indexOf("Apple"));
        System.out.println(fruit.lastIndexOf("Apple"));





    }
}