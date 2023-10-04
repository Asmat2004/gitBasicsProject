package class10;

public class ProjectPART4 {
    public static void main(String[] args) {

        int[][] num = {
                {43, 24, 65, 47, 3, 45, 72},
                {86, 97, 34, 78, 21, 79},
        };
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j] %2==0){
                    sumEven+=num[i][j];
                    }else{
                    sumOdd+=num[i][j];
                }
                }
            }
        System.out.println("The sum of all the even number is "+sumEven);
        System.out.println("The sum of all the odd number is "+sumOdd);

        }


    }

