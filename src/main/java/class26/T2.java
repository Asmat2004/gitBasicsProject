package class26;

import java.util.TreeMap;

public class T2 {
    public static void main(String[] args) {

        TreeMap<String, String> counties = new TreeMap<>();
        counties.put("Botswana", "Gaborone");
        counties.put("Brazil", "Brasilia");
        counties.put("Brunei", "Bandar");
        counties.put("Bulgaria", "Sofia");

        counties.forEach((k, v) -> System.out.println(k + " " + v));




    }
}
