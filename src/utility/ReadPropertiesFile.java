package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public static void main(String[] args) throws IOException {

        // 1. read the file
        FileInputStream fis = new FileInputStream("config/config.properties");

        // 2. create the object of Properties class
        Properties prop = new Properties();

        //3. load this properties object with the file object
        prop.load(fis);

        //4. read the value of the key using getProperty() method
        String myUrl = prop.getProperty("url");

        System.out.println(prop.getProperty("url"));
        System.out.println(myUrl);





    }
}
