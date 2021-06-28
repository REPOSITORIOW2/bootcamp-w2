package src;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance (String objName){

        Properties properties = new Properties();
        String propertiesFile = System.getProperty("user.dir") +"/project/src/myfactory.properties";

        try {
            InputStream inputStream = new FileInputStream(propertiesFile);
            properties.load(inputStream);

            String sorterType = properties.getProperty("sorter");

            Class clazz = Class.forName(sorterType);
            System.out.println("[LOG] Sorter loaded was: " + clazz.getName());
            //return clazz.newInstance();
            return clazz.getDeclaredConstructor().newInstance();

        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found.");
        } catch ( ClassNotFoundException e) {
            System.out.println("Sorter class not found.");
        } catch (IOException e) {
            System.out.println("Properties file can not be read.");
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            System.out.println("Can not load the sorter class porperly.");
        }

        return null;
    }
}
