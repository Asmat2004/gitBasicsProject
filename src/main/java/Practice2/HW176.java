package Practice2;

public class HW176 {
}
    interface ParentInterface{
        void parentMethod();
    }
    interface ChildInterface extends ParentInterface {
        void childMethod();
    }

class Map implements ChildInterface{

    public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
    }
     public void childMethod(){
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {
        Map m=new Map();
        m.parentMethod();
        m.childMethod();
    }


}

