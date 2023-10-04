package class10;

public class cartester {
    public static void main(String[] args) {


        car Number1=new car();

        Number1.make="Lexus";
        Number1.model="RCF";
        Number1.price=67000;
        Number1.hp="400";
        Number1.goingTopSpeed();  //these should be actions
        Number1.handling();


        car Number2=new car();
        Number2.make="Porsche";
        Number2.model="Cayman 718";
        Number2.price=63000;
        Number2.hp="300";
        Number2.goingTopSpeed();  //these should be actions
        Number2.handling();

    }
}
