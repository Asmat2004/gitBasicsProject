package class26;

import java.util.TreeMap;

public class T3 {
    public static void main(String[] args) {

        TreeMap<String, String> counties = new TreeMap<>();
        counties.put("Botswana", "Gaborone");
        counties.put("Brazil", "Brasilia");
        counties.put("Brunei", "Bandar");
        counties.put("Bulgaria", "Sofia");

        counties.forEach((k, v) -> {
            if (k.length()>5 && v.contains("a")){
                System.out.println(k+" "+v);
            }
        });




    }
}
