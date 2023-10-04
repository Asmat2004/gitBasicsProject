package class10;

public class E2StringDemo {
    public static void main(String[] args) {

        String name="MADINA";

        if(name.length()<8){
            System.out.println("Name not allowed");
        }
        System.out.println(name.toLowerCase());
        System.out.println(name);
        name=name.toLowerCase();   //reassigning the contents in the name variebel
        System.out.println(name);

    }
}
