package class22;

public interface MoveAble {

    public abstract void move();
}

interface WashAble{
    void wash();
}
class Dog implements MoveAble,WashAble{

    public void move(){
        System.out.println("Dogs can jump run and can move");
    }
    public void wash(){
        System.out.println("You can safely wash a dog");
    }
}

class Car implements MoveAble,WashAble{

    public void move(){
        System.out.println("Car can move forwards and backwards and move in cities");
    }
    public void wash(){
        System.out.println("We can wash a car");
}

}