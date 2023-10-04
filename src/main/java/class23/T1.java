package class23;

public class T1 {
    private String email;
    private String userName;
    private int password;


    public T1(String email, String userName, int password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    public T1(String email, int password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail(){
        return email;
    }
    public String getUserName(){
        return userName;
    }
    public int getPassword(){
        return password;
    }

    public void setEmail(String email){
        if (email.contains("@yahoo")){
            this.email=email;
        }else{
            System.out.println("wrong email type");
        }
    }
    public void setUserName(String userName){
        if (!userName.isEmpty() && userName.length()>6){
            this.userName=userName;
        }
    }
    public void setPassword(int password){
        this.password=password;
    }
}
