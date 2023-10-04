package class10;

public class ProjectPART8 {
    public static void main(String[] args) {

        int [] num={12,54,78,46,3,33,67};

        int largest=num[0];
        int smallest=num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i]>largest){
                largest=num[i];
            }
            if (num[i]<smallest){
                smallest=num[i];
            }

            System.out.print(num[i]+" ");

        }
        System.out.println();
        System.out.println(largest);
        System.out.println(smallest);

    }
}
