package review9;

public class Parent {

    String name="James";
    void printHello(){
        System.out.println("Hello world");
    }
    Parent(){
        System.out.println("Parent class constructor");
    }
    Parent(String n){
        System.out.println("Parent class with parameters");
    }


}
class Child extends Parent{
    //String name="John";
    void printHello(){
        System.out.println("Hello java");
    }
    void test(){
        String name="white";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
    void methodTest(){
        super.printHello();
    }
    public Child(){
        super("name");
    }

}