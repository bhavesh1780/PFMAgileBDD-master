package PageFactoryModel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gamita on 21/05/2017.
 */
public class BaseTest extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeClass
    public void openBrowser(){
        browserSelector.selectBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
