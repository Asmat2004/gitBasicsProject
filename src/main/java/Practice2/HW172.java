package Practice2;

public abstract class HW172 {
    public abstract void m1();
    public void m2(){
        System.out.println("Parent class providing implementation");
    }

}

class child extends HW172{

    public void m1(){
        System.out.println("Child class providing implementation");
    }

    public static void main(String[] args) {

        child m=new child();
        m.m1();
        m.m2();
    }
}
