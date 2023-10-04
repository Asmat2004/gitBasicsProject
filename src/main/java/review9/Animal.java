package review9;

public class Animal {

     void sleep(){
         System.out.println("Animal speak");
     }
    void speak(){
        System.out.println("Animal speak");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Wuff Wuff");
    }
}