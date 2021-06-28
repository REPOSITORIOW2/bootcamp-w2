package TM;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {

    public static Object getInstance () {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("./src/TM/MyFactory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String sorter = props.getProperty("sorter");
        try{
            Class<?> myClass = Class.forName(sorter);
            Constructor<?> constructor = myClass.getConstructor();

            return constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException |
                    InvocationTargetException | InstantiationException | IllegalAccessException e){
            e.printStackTrace();
        }
        return null;
    }
}
