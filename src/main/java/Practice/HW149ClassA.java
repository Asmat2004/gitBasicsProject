package Practice;

public class HW149ClassA {

    public void print(){
        System.out.println("Class A");
    }
}
class B extends HW149ClassA{

    @Override
    public void print(){
        System.out.println("Class B");
    }
}
class main{
    public static void main(String[] args) {
        HW149ClassA q2 = new HW149ClassA();
        q2.print();

        B q1 = new B();
        q1.print();

    }
}