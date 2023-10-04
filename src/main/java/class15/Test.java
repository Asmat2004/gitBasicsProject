package class15;

public class Test {

    Test(){
        System.out.println("1");
    }
    Test(String name){
        System.out.println("2");
    }
    Test(int age){
        System.out.println("3");
    }
    Test(String name, int age){
        System.out.println("4");
    }
    Test( int age, String name){
        System.out.println("5");
    }

    public static void main(String[] args) {
        Test t1= new Test(25,"Ash");

    }
}
//if we dont create constructor java creates one behind the scenes