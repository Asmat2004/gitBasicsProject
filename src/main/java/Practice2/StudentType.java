package Practice2;

import java.util.HashSet;

public class StudentType {

    String name;
    String id;

    public StudentType(String name, String id) {
        this.name=name;
        this.id=id;
    }
    public String getInfo(){
        return name +" "+ id;
    }

    public static void main(String[] args) {
        


         HashSet<StudentType> info=new HashSet<>();
        info.add(new StudentType("Sam","ab123"));
        info.add(new StudentType("Jack","bd43"));
        info.add(new StudentType("Mike","74nh"));
        
        info.forEach(x-> System.out.println(x.getInfo()));



    }

}
