package Practice;

public class HW153 {

    public HW153(){
        System.out.println("This is Parent constructor ");
    }

}
class Child extends HW153{

    public Child (){

    }
}

class Main153{

    public static void main(String[] args) {
       new Child();

    }
}