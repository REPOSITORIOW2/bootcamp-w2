import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance (String objName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        try (InputStream input = new FileInputStream("src/MyFactory.properties")) {

            Properties prop = new Properties();

            prop.load(input);

            return Class.forName(prop.getProperty(objName)).getDeclaredConstructor().newInstance();

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    };
}
