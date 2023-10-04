package class9;

public class E92DArrays {
    public static void main(String[] args) {

        String [][] names=
                {
                        {"Hind","Mikail","Ismael","ahmed"},
                        {"John","Bob","Adam","Tamim"},
                        {"Joke","Laugh","John Ahmed","Mohammad"},
                        {"Gui","Backend","Front","API"}};

        for (String [] row:names ){
            for (String v: row) {
                System.out.print(v+","+" ");
            }
            System.out.println();
        }
    }
}
