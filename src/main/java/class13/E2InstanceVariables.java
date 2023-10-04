package class13;

public class E2InstanceVariables {

    String name="Hind";

    void printAge(){
        int age=25;
        System.out.println(age);
        System.out.println((name));
        System.out.println(country);
    }
    void printcountry(){
       // System.out.println(age); error its a local variable
        System.out.println(name); //this is an instance variable
    }
    static String country="Uganda";
}