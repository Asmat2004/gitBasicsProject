package review10;

import org.openqa.selenium.chrome.ChromeDriver;

public class AnimalTester {

    public static void main(String[] args){
        /*Animal animal=new Animal();
        animal.speak();
        animal.eat();

        Dog dog=new Dog();
        dog.speak();
        dog.eat();

        Cat cat=new Cat();
        cat.speak();
        cat.eat();*/


       /* Animal rr =new Dog(); // this works to


        Animal [] arr={new Cat(),new Dog()};
        for (Animal a:arr){
            a.eat();
            a.speak();
        }*/

        ChromeDriver c=new ChromeDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();

        /*FirefoxDriver f=new FirefoxDriver();
        f.manage().window().maximize();
        f.get("https://www.amazo.com");
        f.getTitle();

        EdgeDriver e=new EdgeDriver();
        e.manage().window().maximize();
        e.get("https://www.amazon.com");
        e.getTitle();*/

        /*WebDriver[] webDrivers={new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};
        for (int i = 0; i <webDrivers.length ; i++) {
            WebDriver w= webDrivers[i];
            w.manage().window().maximize();
            w.get("https://www.amazon.com");
            System.out.println(w.getTitle());
            w.quit();

        }*/
    }
}
