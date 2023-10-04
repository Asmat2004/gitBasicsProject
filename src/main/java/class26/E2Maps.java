package class26;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> student = new LinkedHashMap<>();
        student.put(10,"Adam");
        student.put(20,"Ehab");
        student.put(300,"Marta");
        student.put(45,"Ahmed");
        System.out.println(student);
        System.out.println(student.remove(300));
        System.out.println(student);
        student.replace(20,"Jamel");
        System.out.println(student);
    }
}
