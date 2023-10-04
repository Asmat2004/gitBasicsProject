package review11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("Ali");  //0
        names.add("Jamel");  //1
        names.add("Rai");  //2
        names.add("Aya");  //3
        names.add("Aya");  //4

        System.out.println(names.size());
        System.out.println(names.get(2));
        System.out.println(names.remove(1));
        System.out.println(names.remove("Jamel"));  //if false it means not found/no Element
        System.out.println(names.contains("Jamel"));
        //System.out.println(names.remove("Aya"));  //removes the first "Aya" that comes from top to bottom
        System.out.println(names.removeIf(x->x.equals("Aya")));




    }
}
