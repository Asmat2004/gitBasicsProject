package Practice;

public class HW147 {

    static String model;
    double price;
    int quantity;

    public HW147 (String model,double price,int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }

    public  double carStockValue(){
         double results= this.quantity*price;
         return results;

    }

    public void printInfo(){
        System.out.println(model+" "+price+" "+quantity);
    }

    public static void main(String[] args) {
        HW147 q1=new HW147("Toyota 2019 ",20000,125);
        double allResults =q1.carStockValue();
        System.out.println(model+"Stock Value "+allResults);

        HW147 q2=new HW147("BMW 2019 ",13059.6,50);
        allResults= q2.carStockValue();
        System.out.println(model+"Stock Value "+allResults);



    }


}
