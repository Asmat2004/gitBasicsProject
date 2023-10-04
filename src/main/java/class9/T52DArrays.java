package class9;

public class T52DArrays {
    public static void main(String[] args) {

        String [][] Brands ={
                {" ","Chevy","Jeep"},
                {"BMW","Audi","Porsche"},
                {"Toyota","Nissan","Hyundi"},
                {"Lamborghini", "Ferrari", "Alfa"}
        };

        for(String [] amount: Brands){
            for(String cars: amount){
                System.out.print(cars+","+ " ");
            }
            System.out.println();
        }
    }
}
