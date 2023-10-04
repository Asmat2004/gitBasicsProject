package Practice2;

public class HW174 {
    interface MyInterface{
        void method1();
        void method2();

    }
}

class Main extends HW174{

    void method1(){
        System.out.println("Implementation of method1");
    }
    void method2(){
        System.out.println("Implementation of method2");
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.method1();
        m.method2();
    }
}

