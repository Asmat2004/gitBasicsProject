package Practice;

public class ifClassPractice {
    public static void main(String[] args) {


        String userName="Ahmadi1234";
        String email="jhgklga@jhagfa.com";
        String password="324345";


        if(userName.length()>8 && userName.length()<11){
            System.out.println("Username: "+ userName);
        }else if (!email.isEmpty()){
            System.out.println("Email: "+email);
        } else if (password.length()>8 && password.length()<11){
            System.out.println("password: "+password);
        }else{
            System.out.println("all fields set");
            System.out.println("Username: "+ userName);
            System.out.println("Email: "+email);
            System.out.println("password: "+password);
        }
        }


    }

