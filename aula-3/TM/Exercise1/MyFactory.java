package Exercise1;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance(String objName) {
        Properties properties = new Properties();

        Object obj = null;
        try {
            properties.load(new FileInputStream("aula-3/TM/Exercise1/MyFactory.properties"));
            String property = properties.getProperty("sorter", "Not Found");
            Class<?> cls = Class.forName(property);
            Constructor<?> constructor = cls.getConstructor();
            obj = constructor.newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return obj;
    }

}