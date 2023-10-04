package class16;

public class Task {



    private Task(){
        System.out.println("private");
    }

     Task(String name){
         System.out.println("default");
    }

    protected Task(int age){
        System.out.println("protected");
    }

    public Task(double weight){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task();
        new Task("ok");
        new Task(12);
        new Task(12.0);





    }

}
