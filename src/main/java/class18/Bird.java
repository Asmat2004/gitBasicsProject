package class18;

public class Bird {

    String wingSpan;
    String name;
    int amountOfClaws;
    boolean canFly;

    public Bird(String wingSpan, String name, int amountOfClaws, boolean canFly) {
        this.wingSpan = wingSpan;
        this.name = name;
        this.amountOfClaws = amountOfClaws;
        this.canFly = canFly;

    }

    void printInfo() {
        System.out.println(wingSpan + " " + name + " " + amountOfClaws + " " + canFly);
    }
}

    class Sparrow extends Bird{

        public Sparrow(String wingSpan, String name, int amountOfClaws, boolean canFly){
            super(wingSpan,name,amountOfClaws,canFly);
        }

    }

    class Parrot extends  Bird{

        Parrot(String wingSpan, String name, int amountOfClaws, boolean canFly){
            super(wingSpan,name,amountOfClaws,canFly);
        }

    }




class BirdTester {

    public static void main(String[] args) {
        Bird b1=new Bird("2ft","sparrow",3,true);
        b1.printInfo();
        Bird b2=new Bird("1ft","parrot",4,true);
        b2.printInfo();
    }
}