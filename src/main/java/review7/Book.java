package review7;

public class Book {


    String title;
    String author;
    int year;
    double price;

    static int totalBooks;
    static String type;

    void read(){
        System.out.println("i am reading "+title+" book by "+author);
    }
    void changePrice(int changePrice){
        System.out.println("The price of the book "+title+" was changed from "+price+" to "+changePrice);
    }
     double totalWithTax(double tax ){
        double total=price+(price*tax);
        return total;
    }
}
