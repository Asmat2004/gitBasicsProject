package Practice2;

public class HW155A {
    public HW155A(){
        System.out.println("I");
    }
}
class HW155B extends HW155A{
    public HW155B(){
        super();
        System.out.println("am");
    }
}
class HW155C extends HW155B{
    public HW155C(){
        super();
        System.out.println("a tester");
    }
}
class mainHW155 {
    public static void main(String[] args) {
    HW155C c1 = new HW155C();
}
}