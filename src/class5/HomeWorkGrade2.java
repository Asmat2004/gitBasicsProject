package class5;

import java.util.Scanner;

public class HomeWorkGrade2 {
    public static void main(String[] args) {
        System.out.println("please enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        grade = grade.toLowerCase();


        switch (grade) {
            case "a":
                System.out.println("A-Excellent");
                break;
            case "b":
                System.out.println("B-Good");
                break;
            case "c":
                System.out.println("C-Average");
                break;
            case "d":
                System.out.println("D-Bad");
                break;
            default:
                System.out.println(grade + " is unacceptable");


        }


    }
}
