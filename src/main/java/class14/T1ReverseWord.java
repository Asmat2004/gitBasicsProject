package class14;

public class T1ReverseWord {
    public static void main(String[] args) {

        //  StringBuilder sb=new StringBuilder("This is sentence I want to reverse");
        //  sb.reverse();
        //  System.out.println(sb);

        String str = "This is sentence i want to reverse";
        String[] arr = str.split(" ");


        for (int i = 0; i < arr.length; i++) {
         String word=arr[i];
         String reversed=reverseStr(word);
            System.out.println(reversed+" ");
        }


    }

    static String reverseStr(String inputStr) {
        String reversed = "";
        for (int i =inputStr.length()-1 ; i >=0 ; i++) {
            reversed=reversed+inputStr.charAt(i);
        }
        return reversed;
    }

}
