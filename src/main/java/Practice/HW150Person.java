package Practice;

public class HW150Person {

    String firstName;
    String lastName;
    int age;
    public HW150Person(String firstName,String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
}
class Employee extends HW150Person{
    int Salary;
        public  Employee(String firstName,String lastName,int age, int Salary){
        super(firstName,lastName,age);
        this.Salary=Salary;
    }
    public void printInfo() {
        System.out.println(firstName + " " + lastName + " " + age + " " + Salary + " " +Salary);
    }

}
class Tester extends Employee {
    String programingLanguage;

    public Tester(String firstName, String lastName, int age, int Salary, String programingLanguage) {
        super(firstName, lastName, age, Salary);
        this.programingLanguage = programingLanguage;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName + " " + age  + " " + programingLanguage);
    }
}
class ClassTester {
    public static void main(String[] args) {
        Employee t1 = new Employee("Joe", "Smith", 35,35000);
        t1.printInfo();

        Tester t2 = new Tester("Adam", "Smith", 15, 20000, "Java");
        t2.printInfo();
    }

}
