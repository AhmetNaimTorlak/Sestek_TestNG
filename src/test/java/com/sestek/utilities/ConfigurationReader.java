package com.sestek.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        try {
            String path = "configuration.properties"; //--> What file to read
            FileInputStream input = new FileInputStream(path); //--> read the file into java, finds the file using he string path
            properties = new Properties();//--> class that store properties in key / value format
            properties.load(input);//--> the values from the file input is loaded , fed in to the properties object
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String get (String KeyName){
        return properties.getProperty(KeyName);
    }


}
