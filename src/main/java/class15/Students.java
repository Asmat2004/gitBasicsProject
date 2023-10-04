package class15;

public class Students {


    private String name;
    private int grade1;
    private int grade2;
    private int grade3;


    Students(String name1,int gradeFirst,int gradeSecond,int gradeThird){
        name=name1;
        grade1=gradeFirst;
        grade2=gradeSecond;
        grade3=gradeThird;

        int results=grade1+grade2+grade3;
        int average=results/3;
        System.out.println(average);

    }


    public static void main(String[] args) {
        Students finall=new Students("asmat",70,76,79);
    }
}
