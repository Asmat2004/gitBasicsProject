package Practice2;

public class HW178 {
}

class EncapsulationDemo{
    private String empName;
    private int empAge;

    void setEmpName(String name){
        empName=name;
    }
    void getEmpName(){
        System.out.println(empName);
    }
    void setAge(int age){
        empAge=age;
    }
    void getEmpAge(){
        System.out.println(empAge);
    }
}

class tester{
    public static void main(String[] args) {

        EncapsulationDemo e=new EncapsulationDemo();
        e.setEmpName("harry");
        e.setAge(19);
        e.getEmpName();
        e.getEmpAge();


    }
}