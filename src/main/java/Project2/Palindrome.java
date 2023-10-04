package Project2;

public class Palindrome {
    public static void main(String[] args) {

        var palindrome = "notmom";
        var reversed = "";
        palindrome=palindrome.replaceAll(" ","");
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reversed+=palindrome.charAt(i);
        }
var results=true;
        for (int i = 0; i <= palindrome.length() - 1; i++) {
            if(palindrome.charAt(i)!=reversed.charAt(i)) {
                results=false;
            }
        }
        if (results){
            System.out.println("palindrom");
        } else{
            System.out.println("not palindrom");
        }

    }
}
