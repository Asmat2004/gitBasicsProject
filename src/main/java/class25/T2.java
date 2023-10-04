package class25;

import java.util.TreeSet;

public class T2 {
    public static void main(String[] args) {

        TreeSet<String> c=new TreeSet<>();
        c.add("america");
        c.add("brazil");
        c.add("el salvador");
        c.add("spain");
        c.add("portigal");
        c.add("chile");
        c.add("mexico");
        c.add("honduras");
        c.add("portarico");
        c.add("Great britan");

        c.forEach(x-> System.out.println(x));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (String x:c){
            System.out.println(x);
        }


    }
}
