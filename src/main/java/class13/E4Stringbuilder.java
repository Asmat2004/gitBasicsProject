package class13;

public class E4Stringbuilder {
    public static void main(String[] args) {


        String str=new String("Habib");
        String name="Habib";

        StringBuilder stringBuilder=new StringBuilder("Ehab");
        // StringBuilder name2="sdsdf";
       // stringBuilder.reverse();
        //System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder);
        stringBuilder.append("d");



    }
}
