package PageFactoryModel;

import cucumber.api.Scenario;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

/**
 * Created by Gamita on 21/05/2017.
 */
public class TestSuits extends BaseTest{

    Registration registration;

    @BeforeClass
    public void beforeClass(){
        registration = new Registration(driver);
    }




    @Test
    public void userShouldAbleToRegisterSuccessfully(){
        registration.register();
    }


}
