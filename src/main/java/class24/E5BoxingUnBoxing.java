package class24;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {

        int a=10;
        Integer number=new Integer(a);
        Integer number2=10;
        int d=number2.intValue();

        Integer c=10;  //AutoBoxing
        int f=c;  //AutoUnboxing
    }
}
