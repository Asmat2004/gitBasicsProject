package class20;

public class E7Final {

    public static void main(String[] args) {
        final int AGE=10;
       // AGE=20;
        System.out.println(AGE);
    }

}
 class Parent{

    final void marry(){
        System.out.println("take our permission first");
    }
}

class Child extends Parent{
    /*@Override
    void marry(){
        System.out.println("i want to marry someone else");
    }*/
}