package com.meli.aula03.tm;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {

    public static Object getInstance(String objName) {

        try {
            InputStream arquivoPropertie = new FileInputStream("/Users/oamagalhaes/IdeaProjects/bootcamp-w2/exercicios-grupo/src/com/meli/aula03/tm/MyFactory.properties");
            Properties properties = new Properties();
            properties.load(arquivoPropertie);



            return Class.forName("com.meli.aula03.tm." + properties.getProperty("sorter")).getDeclaredConstructor().newInstance();

        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found.");
        } catch (ClassNotFoundException e) {
            System.out.println("Sorter class not found.");
        } catch (IOException e) {
            System.out.println("Properties file can not be read.");
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            System.out.println("Can not load the sorter class properly.");
        }

        return null;
    }
}