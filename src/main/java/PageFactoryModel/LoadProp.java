package PageFactoryModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Gamita on 19/05/2017.
 */
public class LoadProp extends BasePage {

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key){
        prop = new Properties();
        try {
            input = new FileInputStream("C:\\Users\\Gamita\\IdeaProjects\\PFMAgileBDD\\src\\test\\Resources\\config.properties");
            prop.load(input);
        }
        catch (IOException e){
            e.getStackTrace();
        }
        return  prop.getProperty(key);
    }
}
