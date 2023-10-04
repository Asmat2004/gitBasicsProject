package Practice2;

public class class182 {
}



class person{
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private  int birthyear;
    private String ssn;

     void setALL(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

      void getAll(){
            System.out.println(firstname);
            System.out.println(lastname);
            System.out.println(birthmonth+"/"+birthday+"/"+birthyear);
            System.out.println(ssn);
        }

}
class Tester extends person{
    public static void main() {
        Tester m = new Tester();
        //m.setAll("John", "Doe", 10, 25, 1900, "123-45-6789");
        m.setALL("John","Doe",10,25,1900,"123-45-6789");
        m.getAll();
    }
    }
