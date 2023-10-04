package Practice;

public class HW154Parent {

    public HW154Parent(){
        System.out.println("Parent Constructor without argument");
    }
    public HW154Parent(int number){
        System.out.println(number);
    }
}
class HW154Child extends HW154Parent{
    public HW154Child(){
        System.out.println("Child Constructor without argument");
    }
    public HW154Child(int number) {
        super(number);

    }
}
class main154{
    public static void main(String[] args) {
        HW154Child c1=new HW154Child();
        HW154Child c2=new HW154Child(10);
    }


}