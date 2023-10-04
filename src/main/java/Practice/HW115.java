package Practice;

public class HW115 {
    public String test(String str){
        String results=str.toUpperCase();
        return results;
    }

    public static void main(String[] args) {
        HW115 question =new HW115();

        String last=question.test("test");
        System.out.println(last);



    }

}
