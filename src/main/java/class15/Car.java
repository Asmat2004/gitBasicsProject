package class15;

public class Car {

//instance field
    private String make;  //should alwasy have our feilds private
    private String model;
    private String color;
    private double price;

    //constructor should be public
    //parameters should have different names
    //constructors are the first code that execute
   public Car(String cMake, String cModel, String cColor, double cPrice ){
         make=cMake;
        model=cModel;
        color=cColor;
         price=cPrice;

    }
    //method
   public void printInfo(){
        System.out.println(make+" "+model+" "+color+" "+price);
    }

    public void setPrice(double cPrice){
       price=cPrice;
    }
    double getPrice(){
       return price;
    }
}


//feilds, constroctors,  methods