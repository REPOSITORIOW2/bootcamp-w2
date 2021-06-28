package poo.aula3.tt;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {

    public static Sorter<?> getInstance(String objName) throws Exception {
        Properties prop = getProp();
        String className = prop.getProperty("sorter");
        return (Sorter<?>) Class.forName(className).getDeclaredConstructor().newInstance();

    }

    public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(
                "src/poo/aula3/tt/MyFactory.properties");
        props.load(file);
        return props;
    }
}
