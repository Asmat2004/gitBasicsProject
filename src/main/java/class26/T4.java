package class26;

import java.util.LinkedHashMap;

public class T4 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> BestBuy= new LinkedHashMap<>();
        BestBuy.put(3452,"phone");
        BestBuy.put(67869,"computer");
        BestBuy.put(847534,"desktop");

        var Change=BestBuy.entrySet();
        for (var a:Change){
            System.out.println(a.getKey()+" "+a.getValue());
        }


    }
    }

