package class10;

public class Student {
    //these are called Properties/Attributes
    String name;
    int age;
    String id;
    //Methods/Functional/Behaviors
    void study (){
        System.out.println("Studying 16 hours a day........");
    }

    public static void main(String[] args) {
        //we are creating an actual student by using the Student class
        Student ehabObj=new Student();
        ehabObj.name="ehab";
        ehabObj.age=23;
        ehabObj.id="abc123";
        ehabObj.study(); //scanner.nextInt();

        Student habibObj=new Student();
        habibObj.name="Habib";
        habibObj.age=20;
        habibObj.id="abd123";
        habibObj.study();
    }
}
