package Practice;

public class HW67 {
    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < 1; i += 2) {
            for (int j = 2; j <= 20; j = j + 2) {
                System.out.print(j + " ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < 1; i += 2) {
            for (int j = 3; j <= 30; j = j + 3) {
                System.out.print(j + " ");
            }
        }


    }
}