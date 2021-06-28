package aula5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance (String objName) {
        try (InputStream input = new FileInputStream("src/aula5/MyFactory.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            String propertie = prop.getProperty("sorter");

            return Class.forName(propertie);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }
    }

//    public static void main(String[] args) {
//        Object res = MyFactory.getInstance("Teste");
//        System.out.println(res);
//    }
}
