package class10;

public class ProjectPART2 {
    public static void main(String[] args) {

        int[] nums = {56, 13, 99, 89, 3, 534, 67};
        int sum = 0;
        for (int break1 : nums) {
            System.out.print(break1 + " ");
            sum+=break1;
        }
        System.out.println();
        System.out.println("The sum of all the numbers is "+sum);



    }
}
