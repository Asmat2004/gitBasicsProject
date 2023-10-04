package Practice;

public class NestedLoopsDrawing {
    public static void main(String[] args) {

        /*
             O  O
            ______
                     */


        for (int i = 0; i <2; i++) {
            for (int j = 0; j <7 ; j++) {
                if (i==0&&j==2 || i==0&&j==4){
                    System.out.print("0");
                }else if(i==1&&j==0 ||i==1&&j==1|| i==1&&j==2 ||i==1&&j==3 || i==1&&j==4|| i==1&&j==5||i==1&&j==6||i==1&&j==7){
                    System.out.print("_");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
