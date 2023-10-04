package class19;

public class Degree {



    public void getPrerequisite(){
        System.out.println("TO get a degree you need high school diploma");
    }


}

class Bachelors extends Degree{

}

class Masters extends Bachelors{
    public void getPrerequisite(){
        System.out.println("To get a degree you need a Bachelors diploma");
    }
}

class tester{
    public static void main(String[] args) {
        Masters m1=new Masters();
        m1.getPrerequisite();
    }
}