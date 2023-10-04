package class21;

public abstract class Animal {

    String name;
    String breed;
    String color;
    abstract void speak();
     abstract void sleep();
    abstract void eat();
    //abstract String getString(String a,int b);

    public  void printInfo(){
        System.out.println(name+" "+breed+" "+color);
    }
}
class Dog extends Animal{


    @Override
    void speak(){
        System.out.println("Wuff Wuff....");
    }

    @Override
    void sleep(){
        System.out.println("sleeping for last 10 hour.....");
    }
    @Override
    void eat(){
        System.out.println("eat bone...");
    }
}

class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("meow meow....");
    }

    @Override
    void sleep(){
        System.out.println("sleeping for last 15 hour.....");
    }
    @Override
    void eat(){
        System.out.println("eat fish...");
    }
}