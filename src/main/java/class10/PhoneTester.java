package class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone Iphone = new Phone();

        Iphone.name = "14 pro";
        Iphone.battery = 99;
        Iphone.price = 1500;
        Iphone.quality = "4k";

        System.out.println(Iphone.name);
        System.out.println(Iphone.battery);
        System.out.println(Iphone.price);
        System.out.println(Iphone.quality);

        Iphone.pictues();
        Iphone.brightness();


    }
}
