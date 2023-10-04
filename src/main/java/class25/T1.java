package class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class T1 {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        HashSet<String> dups=new HashSet<>(aList);
        aList.clear();
        aList.addAll(dups);
        System.out.println(aList);
    }
}
