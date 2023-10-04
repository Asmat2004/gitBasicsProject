package class18;

public class userClass {

    String name;

    int mobileNumber;

     public userClass(String name, int mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}

class userInfo extends userClass{
    String address;

    public userInfo(String name, int mobileNumber, String address) {
        super(name, mobileNumber);
        this.address=address;
    }
    void printInfo(){
        System.out.println("name: "+name+" Phone Number: "+mobileNumber+" Address: "+address);
    }
}

class tester{
    public static void main(String[] args) {
userInfo q1=new userInfo("ahmadi", 6673347,"1324 upStreet");
q1.printInfo();

    }
}