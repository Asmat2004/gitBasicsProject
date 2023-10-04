package class7;

public class E6NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i <=5 ; i++) {  // outer loop controls the number of lines
            for (int j = 0; j <=i ; j++) {    //inner loop controls thr number of outputs
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
