package class20;

public class E4PolyMor {

    public static void main(String[] args) {
       /* Animal a =new Animal();
        a.speak();
        a.sleep();
        a.eat();
        Dog d= new Dog();
        d.speak();
        d.sleep();
        d.eat();
        Cat c= new Cat();
        c.speak();
        c.sleep();
        c.eat();*/

        Animal[] arr={new Cat(),new Dog(),new Animal()};
        for(Animal a: arr){
            a.eat();
            a.sleep();
            a.speak();
        }




       /* Animal[] arr={new Cat(),new Dog(),new Animal()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            arr[i].sleep();
            arr[i].speak();

        }*/
    }
}
