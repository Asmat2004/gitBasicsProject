package class16;

public class cat {


    private String name;
    private String breed;
    private int age;
    private String color;
    private double cost;

   public cat(){
        System.out.println("you do not have a cat");
    }
   public cat(String name,int age,String color){
        this.name= name;
        this.age= age;
        this.color= color;
    }


   public cat(String name,int age,String color, double cost){
        this.name= name;
        this.age= age;
        this.cost=cost;
        this.color= color;
    }


   public cat(String name, String breed,int age,String color, double cost){
        this.name= name;
        this.breed= breed;
        this.age= age;
        this.cost=cost;
        this.color= color;
    }
    public  void Info(){
        System.out.println(name+" "+breed+" "+age+" "+cost+" "+color);
    }

}
