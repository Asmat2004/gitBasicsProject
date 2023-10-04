package Practice;

public class Q1HomeWork {
    public static void main(String[] args) {

        int myNumber = 2895;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour-myNumber;
        int stepSix = stepFive/6;

        String magic="The magic number is ";
        System.out.println(magic+stepSix);



    }
}
