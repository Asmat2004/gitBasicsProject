package class20;

import org.openqa.selenium.chrome.ChromeDriver;

public class E5Selenium {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://google.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://facebook.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://amazon.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().back();
        chrome.close();

        /*SafariDriver safari = new SafariDriver();
        safari.manage().window().maximize();
        Thread.sleep(2000);
        safari.navigate().to("https://google.com");
        System.out.println(safari.getTitle());
        Thread.sleep(2000);
        safari.navigate().to("https://facebook.com");
        System.out.println(safari.getTitle());
        Thread.sleep(2000);
        safari.navigate().to("https://amazon.com");
        System.out.println(safari.getTitle());
        Thread.sleep(2000);
        safari.navigate().back();
        safari.close();*/
    }
}
