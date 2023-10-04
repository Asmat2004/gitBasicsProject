package review9;

public class Printer {

     void print(){
        System.out.println("hello");
    }
     void print(String word){
        System.out.println(word);
    }
    void print(int age){
        System.out.println(age);
    }
    void print(double weight){
        System.out.println(weight);
    }
    void print(String word,int num){
        System.out.println(word+" "+num);
    }
    void print(int num,String word){
        System.out.println(num+" "+word);
    }
    void print(int...arr){ // if user dont know how many parameters to pass. this gives it no limit.
        for(int num: arr){
            System.out.println(num);
        }
    }
    void print(String...a){
        System.out.println("pass as many");
    }
    public static void main(int[] args) {

    }
}
