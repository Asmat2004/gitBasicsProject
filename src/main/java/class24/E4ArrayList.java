package class24;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(100);
        numbers.add(5);
        Integer sum=0;
        for(Integer n:numbers){
            if (n>20){
                sum+=n;
            }

        }
        System.out.println(sum);

    }
}