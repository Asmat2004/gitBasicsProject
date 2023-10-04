package class8;

public class T6EnhancedLoop {
    public static void main(String[] args) {

//find largest even number
        int[] nums = {10, 77, 25, 56, 60, 20};
int largest=nums[0];
        for (int n : nums) {
            if (n>largest && n%2==0){
                largest=n;
            }
        }
        System.out.println(largest);
    }
}

