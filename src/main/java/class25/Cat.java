package class25;

import java.util.ArrayList;

public class Cat {

    String name;
    int age;
    String color;

    public Cat(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color =color;
        System.out.println(name+" "+age+" "+ color);
    }

    public static void main(String[] args) {
        Cat c=new Cat("james",12,"blue");
        Cat c2=new Cat("sam",2,"black");
        Cat c3=new Cat("apple",2,"brown");

        ArrayList<Cat> arr=new ArrayList<>();
        arr.add(c);
        arr.add(c2);
        arr.add(c3);


    }
}
