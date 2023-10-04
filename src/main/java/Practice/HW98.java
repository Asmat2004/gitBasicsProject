package Practice;

public class HW98 {
    public static void main(String[] args) {


        String str = "Hello Syntax friends";

        String[] split=str.split(" ");

        for (int i = 0; i < split.length; i++) {
             str.replace(split[i],"welcome");
            }


        System.out.println(str);




    }
}
