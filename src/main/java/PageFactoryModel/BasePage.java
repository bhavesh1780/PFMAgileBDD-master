package PageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Gamita on 21/05/2017.
 */
public class BasePage {

    public static WebDriver driver;

    BasePage(){

        PageFactory.initElements(driver,this);
    }
}
