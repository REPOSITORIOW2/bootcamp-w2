import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance(String objName) throws IOException {
        InputStream inputStream = null;
        Object objectResult = null;

        try {
            Properties prop = new Properties();
            inputStream = new FileInputStream("src/MyFactory.properties");

            prop.load(inputStream);

            String sortType = prop.getProperty("sorter");
            Class sortClass = Class.forName(sortType);

            objectResult = sortClass.getDeclaredConstructor().newInstance();
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException err) {
            err.printStackTrace();
        } finally {
            inputStream.close();
        }

        return objectResult;
    }
}
