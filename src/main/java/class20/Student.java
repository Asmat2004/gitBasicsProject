package class20;

public class Student {

    void study(){
        System.out.println("studying hard");
    }
    void write(){
        System.out.println("writing notes with pencil");
    }
    void eating(){
        System.out.println("eat warm meal");
    }
}

class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Study for 8 hours");
    }
    @Override
    void write(){
        System.out.println("write notes on ipad");
    }
    @Override
    void eating(){
        System.out.println("Eat fresh meals");
    }
}
class CollegeStudent extends Student{
    @Override
    void study(){
        System.out.println("Study for 12 hours");
    }
    @Override
    void write(){
        System.out.println("Write with pen");
    }
    @Override
    void eating(){
        System.out.println("Eats cold meals");
    }
}
class SchoolStudents extends Student{

    @Override
    void study(){
        System.out.println("Study for 2 hours");
    }
    @Override
    void write(){
        System.out.println("Write with nothing");
    }
    @Override
    void eating(){
        System.out.println("Mom cooks meals");
    }
}

class tester{
    public static void main(String[] args) {

        Student [] arr={new Student(),new SyntaxStudent(),new CollegeStudent(),new SchoolStudents()};
        for (int i = 0; i < arr.length ; i++) {
            arr[i].eating();
            arr[i].study();
            arr[i].write();
        }



    }
}