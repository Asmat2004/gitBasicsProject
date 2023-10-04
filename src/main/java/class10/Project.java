package class10;

public class Project {
    public static void main(String[] args) {

        int [] temp={70,73,80,54,99};

int largest=temp[0];
int smallest=temp[0];
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>largest){
                largest =temp[i];
            }
            if(temp[i]<smallest){
            smallest=temp[i];}
            System.out.print(temp[i]+" ");
        }
        System.out.println();
        System.out.print("The largest temperature recorded is "+largest );
        System.out.println();
        System.out.print("The smallest temparaure recorded is "+smallest);


    }
}
