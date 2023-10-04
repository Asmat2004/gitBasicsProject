package class11;

public class HW4StringMethods {
    public static void main(String[] args) {

        String str="This is sentence i want to reverse";
        String [] split=str.split(" ");


        for (int i = 0; i <split.length ; i++) {
            for (int j =split[i].length()-1 ; j >=0; j--) {
                System.out.print(split[i].charAt(j));
            }
            System.out.print(" ");

        }

        }

    }

