package Practice;

public class HW143 {

    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public HW143(String make, String model, int numberOfDoors, int topSpeed, double price ){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public HW143(String make, String model, int topSpeed, double price ){

        this.make=make;
        this.model=model;
        this.numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public HW143( int topSpeed,int numberOfDoors, double price ){
        this.make="Unknown";
        this.model="Unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public HW143(String make, String model, int numberOfDoors ){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;
    }


    public void info(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

public static void main(String [] args){
    HW143 q1=new HW143("Toyota", "Prius", 4, 120, 30000.0);
    q1.info();
    HW143 q2=new HW143("Toyota", "Prius",  120, 30000.0);
    q2.info();
    HW143 q3=new HW143(4, 120, 30000.0);
    q3.info();
    HW143 q4=new HW143("Toyota", "Prius", 4);
    q4.info();
}
}
