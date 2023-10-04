package class25;

import java.util.LinkedList;

public class E4ArrayListVsLinedList {
    public static void main(String[] args) {

        long statingTime=System.currentTimeMillis();


        LinkedList<Integer>list=new LinkedList<>();
        for (int i = 0; i <1000000 ; i++) {
            list.add(0,i);
        }

        for (int i = 0; i <1000 ; i++) {
            System.out.println(100000);
        }

        /*ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <1000000 ; i++) {
            arr.add(0,i);
        }*/

        long endTime=System.currentTimeMillis();
        long timeTook=(endTime-statingTime);
        System.out.println(timeTook);



    }
}
