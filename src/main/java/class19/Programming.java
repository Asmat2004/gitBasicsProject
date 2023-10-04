package class19;

public class Programming {


    public Programming(){
        System.out.println("I love programing languages");
    }

    public Programming(String str){
        System.out.println("I love " +str);
    }


    public static void main(String[] args) {
        new Programming();
        new Programming("me");
    }
}
