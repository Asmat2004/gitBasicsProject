package review7;

public class SuperHeros {

    String name, power;
    int age;
    char gender;


    SuperHeros(String name, String power){
        this.name=name;
        this.power=power;
    }
    SuperHeros(String name, String power,int age){
        this(name,power);
        this.age=age;
    }




    public static void main(String[] args) {
        SuperHeros hero1=new SuperHeros("Superman","Fly");
        SuperHeros hero2=new SuperHeros("Batman","Money", 27);
    }



}
