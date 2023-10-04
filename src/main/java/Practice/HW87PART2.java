package Practice;

public class HW87PART2 {
    public static void main(String[] args) {

        /*
        Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
         */

        HW87 car1=new HW87();

        car1.carColor="Black";
        car1.carYear=2019;
        car1.carMake="BMW";

        HW87 car2=new HW87();
        car2.carColor="White";
        car2.carYear=2018;
        car2.carMake="Toyota";


        System.out.println("Car color is "+car1.carColor+ " and car year is "+ car1.carYear+" and car model is " +car1.carMake);
        System.out.println("Car color is "+car2.carColor+ " and car year is "+ car2.carYear+" and car model is " +car2.carMake);


    }
}
