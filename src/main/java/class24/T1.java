package class24;

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {

        ArrayList <String> names=new ArrayList<>();
        names.add("Sahel");
        names.add("Siam");
        names.add("Sayem");
        names.add("sayema");
        names.add("sumaya");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Sayem"));
        System.out.println(names.size());
        for (String p:names){
            System.out.println(p);
        }



    }
}
