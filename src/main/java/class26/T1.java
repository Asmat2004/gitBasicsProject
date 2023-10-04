package class26;

import java.util.LinkedHashMap;

public class T1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> house= new LinkedHashMap<>();
        house.put(1,"Apple");
        house.put(2,"Microsoft");
        house.put(3,"Google");
        house.put(4,"Syntax");
        house.put(5,"BestBuy");
        house.put(6,"Walmart");
        house.put(7,"Costco");
        house.size();
        house.replace(4,"Windows");
        house.remove(7);
        System.out.println(house);



    }
}
