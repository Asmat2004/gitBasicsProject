package class10;

public class ProjectPART3 {
    public static void main(String[] args) {

        int [][] num={
                {43,24,65,47,3,45,72},
                {86,97,34,78,21,79},
        };

        for (int [] break1:num){
            for (int break2:break1){
                if(break2 %2==0){
                    System.out.println(break2);

                }
            }

        }

    }
}
