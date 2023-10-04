package review6;

public class E2StringMethods {
    public static void main(String[] args) {

        String str="This is a java class";
        boolean starts=str.startsWith("T");
        System.out.println(starts);
        System.out.println(str.endsWith("class"));
        System.out.println(str.contains("java"));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf(97));
         char c=str.charAt(8);
        System.out.println(c);


    }
}

        // int num='a';   no error




