package review11;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");  //0
        fruit.add("Mango");  //1
        fruit.add("orange");  //2
        fruit.add("Kiwi");  //3
        fruit.add("Banana");  //4
        fruit.add("Cherry");  //5

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");  //0
        vegetables.add("Carrot");  //1
        vegetables.add("Cucumber");  //2
        System.out.println(vegetables);
        vegetables.addAll(fruit);
        System.out.println(vegetables);
        vegetables.remove(fruit);
        System.out.println(vegetables);









    }
}
