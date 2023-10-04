package review10;

public class Car implements WashAble{

    public void drive(){
        System.out.println("Driving.......");
    }
    @Override
    public void wash(){
        System.out.println("you can take a car to carWah service");
    }
}
class Horse implements WashAble{

    @Override
    public void wash(){
        System.out.println("Horse can wash themselves ");
    }
}