package day41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

    public static void main(String[] args) throws IOException {

        //Location of properties file
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");

        //Loading data from properties file
        Properties propertiesobj = new Properties();
        propertiesobj.load(file);

        //Reading data from properties
        String url = propertiesobj.getProperty("appurl");
        String email = propertiesobj.getProperty("email");
        String password = propertiesobj.getProperty("password");
        String orderId = propertiesobj.getProperty("orderid");
        String customerId = propertiesobj.getProperty("customerid");

        //Reading all the keys from properties file
        Set<Object> keys = propertiesobj.keySet();
        System.out.println(keys);

        //Reading all the values from properties file
        Collection<Object> values = propertiesobj.values();
        System.out.println(values);
    }
}
