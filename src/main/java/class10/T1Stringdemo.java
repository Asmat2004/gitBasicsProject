package class10;

import java.util.Scanner;

public class T1Stringdemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your username");
        String username= scanner.nextLine();
        System.out.println("Type your password");
        String password= scanner.nextLine();
        System.out.println("Confirm your password ");
        String confirmPass= scanner.nextLine();


            if (username.isEmpty() || password.isEmpty()){
                System.out.println("Username or Password cannot be empty");
            } else if (password.length()<8){
                System.out.println("Password is to short");
            } else if (password.contains(username)){
                System.out.println("Password cannot contain username");
            } else if (!password.equals(confirmPass)){
                System.out.println("Passwords do not match");
            } else {
                System.out.println("Your username and password have been Created");
            }

    }
 }

