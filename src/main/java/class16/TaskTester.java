package class16;

public class TaskTester {

    public static void main(String[] args) {

      //  new Task(); // private - can be called in same class
        new Task("ok"); // default - must be same package
        new Task(12);  // protected - anywhere
        new Task(12.0); //public - anywhere


    }

}
