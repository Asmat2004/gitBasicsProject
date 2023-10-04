package class17;

public class AnimalTester {
    public static void main(String[] args) {

        cat c=new cat();
        c.name="Tom";
        c.breed="Reussian";
        c.color="white";
        c.age=8;
        c.printInfo();
        Dog d= new Dog();
        d.bark();
        d.name="Jacky";
        d.breed="German";
        d.printInfo();
        Animal a= new Animal();
        a.name="Jim";
        a.color="Black";
        a.printInfo();


    }
}
