package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E3ConfigProperties {

    public static void main(String[] args) throws IOException {



        String url=getProperty("url");
        String userName=getProperty("userName");
        String password=getProperty("password");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userNameField=driver.findElement(By.id("txtUsername"));
        userNameField.sendKeys(userName);
        WebElement userPassField=driver.findElement(By.id("txtPassword"));
        userPassField.sendKeys(password);

        WebElement loginBtn= driver.findElement(By.id("btnLogin"));
        loginBtn.click();

        String value=getProperty("password");
        System.out.println(value);

    }
    public static String getProperty(String propKey) throws IOException {
        String path=System.getProperty("user.dir")+"\\File\\Config.properties";
        FileInputStream fis =new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        String value=prop.getProperty(propKey);
        return value;
    }
}
