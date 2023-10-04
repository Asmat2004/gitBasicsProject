package Practice2;

public class HW157Parent {

    void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child extends HW157Parent{
    void m1(){
        System.out.println("m1 method in Child class");
    }
    void m2(){
        m1();
        super.m1();
    }
}