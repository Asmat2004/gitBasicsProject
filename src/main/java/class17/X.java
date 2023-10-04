package class17;

public class X {
    String name;

    void printName(){
        System.out.println(name);
    }

}

 class Y extends X{

    String age;
    void printAge(){
        System.out.println(name+" "+age);
    }
}

class Z extends Y{
    String color;
    void printNameAgeColor(){
        System.out.println(name+" "+age+" "+color);
    }
}