package Practice2;

public class HW156A {
    int i=10;

}
class HW156B extends HW156A{
int i =20;

void display(){
    System.out.println(super.i);
    System.out.println(i);
}
}
class main156{
    public static void main(String[] args) {
        HW156B h=new HW156B();
        h.display();
    }


}