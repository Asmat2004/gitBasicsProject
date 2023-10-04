package class9;

public class T32DArrays {
    public static void main(String[] args) {

        String[][] students =
                {
                        {"Aysha", "Giulia", "John", "Deepali"},
                        {"A", "A+", "C", "B"}
                };

        for (int i = 0; i <=3 ; i++) {
            if(students[1][i].equalsIgnoreCase("A")||students[1][i].equalsIgnoreCase("B"))
            System.out.println(students[0][i]);
        }


    }
}
