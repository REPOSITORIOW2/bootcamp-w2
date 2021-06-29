package br.com.meli.modulo5.dia3.TM;

import java.io.FileReader;
import java.util.Properties;

public class MyFactory {

    public static Object getInstance (String objName){

        Properties p = new Properties();

        try {

            FileReader fr = new FileReader("src/br/com/meli/modulo5/dia3/TM/MyFactory.properties");
            p.load(fr);

            Class c = Class.forName(p.getProperty(objName));

            Sorter instance = (Sorter) c.getDeclaredConstructor().newInstance();

            return instance;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
