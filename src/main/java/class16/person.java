package class16;

public class person {


    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairColor;


    public  person(){

    }


    public  person(String pName, int pAge, double pWeight){
        this.name=name;
        this.age=age;
        this.weight=weight;


    }
    public  person(String pName, int pAge, double pWeight, char pGender,int salary, String hairColor){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.gender=gender;
        this.salary=salary;
        this.hairColor=hairColor;
    }
    public  person(String pName, int pAge, double pWeight, char pGender){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.gender=gender;

    }

    public void printInfo(){
        System.out.println(name+" "+age+" "+weight+" "+gender);
    }





}
