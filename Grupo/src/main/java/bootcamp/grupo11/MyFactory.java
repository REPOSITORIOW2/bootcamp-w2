package bootcamp.grupo11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.io.*;

public class MyFactory {

    public static <T> Sorter<T> getInstance(Class<T> sorterType) {
        try {
            String sorterClass = getSorterClassFromProperties();
            Object instance = createInstance(sorterClass);
            if (instance instanceof Sorter) {
                return (Sorter) instance;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static String getSorterClassFromProperties() throws IOException {
        var resourceStream = MyFactory.class.getResourceAsStream("/MyFactory.properties");
        Properties p = new Properties();
        p.load(resourceStream);
        return p.getProperty("sorter");
    }


    private static Object createInstance(String location) {
        try {
            Class<?> clazz = Class.forName(location);
            Constructor<?> constructor = clazz.getConstructor();
            Object instance = constructor.newInstance();
            return instance;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}