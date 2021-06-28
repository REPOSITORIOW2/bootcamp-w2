import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance(String objName) {
        try {
            Properties prop = new Properties();
            InputStream is = new FileInputStream("/MyFactory.properties");

            prop.load(is);

            String sortType = prop.getProperty("sorter");
            Class sortClass = Class.forName(sortType);

            return sortClass.getDeclaredConstructor().newInstance();
        } catch (IOException | ClassNotFoundException err) {
            err.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
