package com.bootcamp.tm.exercicio1;

import com.bootcamp.tm.exercicio1.sorter.Sorter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyFactory {

    public static Sorter getInstance () {
        Properties properties = getProperties();
        String clazz = properties.getProperty("sorter");
        try {
            Class c = Class.forName("com.bootcamp.tm.exercicio1.sorter." + clazz);

            return (Sorter) c.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Properties getProperties() {
        Properties prop = new Properties();
        String propFileName = "MyFactory.properties";

        InputStream inputStream = MyFactory.class.getClassLoader().getResourceAsStream(propFileName);

        if (inputStream != null) {
            try {
                prop.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return prop;
    }

}
