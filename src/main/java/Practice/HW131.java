package Practice;

public class HW131 {

public static String thirdLetter(String s){
    String third = "";
    for (int i = 0; i <s.length(); i=i+3) {
        third= (third+s.charAt(i));

    }
    return third;
}

    public static void main(String[] args) {
        thirdLetter("dont make it complicated");

    }

}
