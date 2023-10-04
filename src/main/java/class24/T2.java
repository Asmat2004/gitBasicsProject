package class24;

import java.util.ArrayList;

public class T2 {

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("RCF");
        names.add("Z06");
        names.add("918 cayman");
        names.add("C63");
        names.add("rs5");

        for (String p:names){
            System.out.println(p);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i <names.size(); i++) {
            System.out.println(names.get(i));
        }



    }
}
