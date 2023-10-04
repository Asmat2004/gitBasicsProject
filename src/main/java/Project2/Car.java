package Project2;

public class Car {

     double carPrice;
     String color;


    public double calculateSalePrice(double CarPrice) {
        double result = this.carPrice = CarPrice;
        return result;
    }
}

class truck extends Car {

    int weight;

    public double calculateSalePrice(double CarPrice, int weight) {
        this.weight = weight;
        
        if (weight > 2000) {
            double calculate =CarPrice * (20 / 100);
            return calculate;
        } else {
           double calculate1= CarPrice * (10 / 100);
           return calculate1;
        }
    }
}

