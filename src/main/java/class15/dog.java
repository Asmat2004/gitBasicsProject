package class15;

public class dog {

  private  String name;
    private  String breed;
    private  String color;
    private int age;

dog(String dName,String dBreed, String dColor, int dAge){
    name=dName;
    breed=dBreed;
    color=dColor;
    age=dAge;

}
   public void bark(){
        System.out.println("wuf wuf....");
    }

   public void printInfo(){
        System.out.println(name+" "+breed+" " +color);
    }

}
