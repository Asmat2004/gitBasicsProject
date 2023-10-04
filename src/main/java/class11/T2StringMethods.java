package class11;

public class T2StringMethods {
    public static void main(String[] args) {

        String words="Momentarily";


            if(words.length()%2!=0&&words.length()>=3){
                int middle=words.length()/2;
                System.out.println(words.charAt(middle));

        }



           String str="Aftermath";

        for (int i = str.length()-1; i >0 ; i--) {
            System.out.print(str.charAt(i));
        }



    }
}
