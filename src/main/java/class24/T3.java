package class24;

import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) {
        ArrayList<String> Drinks = new ArrayList<>();
        Drinks.add("Cok");
        Drinks.add("Fanta");
        Drinks.add("Pepsi");
        Drinks.add("Sprite");

        for (int i = 0; i <Drinks.size() ; i++) {
            if (Drinks.get(i).contains("a")||Drinks.get(i).contains("e")){
                Drinks.set(i,"water");
            }
        }

            System.out.println(Drinks);
        }
    }

