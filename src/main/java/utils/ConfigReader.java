package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public void openPropFiles(String path) throws IOException {
        FileInputStream fis =new FileInputStream(path);
        properties=new Properties();
        properties.load(fis);
    }
    public String getPropertyValue(String Key){
        return properties.getProperty(Key);
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
