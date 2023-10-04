package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

        //String path="C:\\Users\\Nabi\\IdeaProjects\\java basics\\Files\\Config.properties";
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        System.out.println(path);
        FileInputStream fis=new FileInputStream(path);
        Properties  properties=new Properties();
        properties.load(fis);
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(System.getProperty("user.dir"));

    }
}
