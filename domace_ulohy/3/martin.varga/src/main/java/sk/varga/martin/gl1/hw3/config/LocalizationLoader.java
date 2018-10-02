package sk.varga.martin.gl1.hw3.config;

import sk.varga.martin.gl1.hw3.enums.Localization;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocalizationLoader {

    public static void setLocalization(Localization localization){
        try {
            //D:\Projects\Idea\teaching\cvicenia\5\varga.martin
            String filePath = System.getProperty("user.dir") + "/domace_ulohy/3/martin.varga/src/main/resources/localization/" + localization.getEngValue() + ".properties";
            FileInputStream propFile = new FileInputStream(filePath);
            Properties p = new Properties(System.getProperties());
            p.load(propFile);
            // set the system properties
            System.setProperties(p);
            // display new properties
//            System.getProperties().list(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
