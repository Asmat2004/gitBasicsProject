package Practice;

public class HW141 {

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
return max;
    }

    public static void main(String[] args) {
int [] numbers={10,5,22,8};

        HW141 q1=new HW141();
        System.out.println(maxValue(numbers));

    }

}

