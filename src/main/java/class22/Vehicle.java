package class22;

public interface Vehicle {

    void drive();
}

interface Bike extends Vehicle{
    void applyBreaks();
}

class HondaBike implements Bike{

    @Override
    public void drive(){
        System.out.println("Driving......");
    }

    public void applyBreaks(){
        System.out.println("Stop.......");
    }
}