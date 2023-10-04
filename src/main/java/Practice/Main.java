package Practice;

public class Main {
    private String name;
    private String lastName;
    private int employeeId;
    private String startDate;
    private int salary;

    public Main(){

    }
    public Main(String name, String lastName, int employeeId, String startDate, int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;

    }

    public void printInfo(){
        System.out.println(name+ " "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }


    public static void main(String[] args) {
        Main q1=new Main();
        q1.printInfo();
        Main q2=new Main("Joe","Smith",12345,"01/01.1970",35000);
        q2.printInfo();

    }
    

}

