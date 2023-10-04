package Practice;

public class HW145 {

    private String dogName;
    private String dogBreed;
    private double dogWeight;



    public HW145( String dogName, double dogWeight){
        this.dogName=dogName;
        this.dogBreed="Mutt";
        this.dogWeight=dogWeight;
    }

    public void  info(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }

    public static void main(String[] args) {
        HW145 q1= new HW145("Tarzan", 50.0);
        q1.info();
    }

}

