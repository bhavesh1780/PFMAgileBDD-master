package PageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration extends BasePage
{

    Registration(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "ico-register")
    private WebElement _registerbtn;

    @FindBy(id= "gender-female")
    private WebElement _female;

    @FindBy(name="FirstName")
    private WebElement _firstName;

    @FindBy(name = "LastName")
    private WebElement _lastName;

    @FindBy(id="Email")
    private WebElement _email;

    @FindBy(name = "Company")
    private WebElement _companyName;

    @FindBy(id="Password")
    private WebElement _password;

    @FindBy(id="ConfirmPassword")
    private WebElement _confirmPassword;

    @FindBy(id="register-button")
    private WebElement _register;

    @FindBy(className = "result")
    private WebElement _asserResult;

    @FindBy(name = "register-continue")
    private WebElement _continueto;



    public void register()
    {
        // click on PageFactoryModel.Registration button
        Utils.clickOnElement(_registerbtn);

        //selects gender
        Utils.clickOnElement(_female);

        // Type Details
        Utils.typeText(_firstName, "Test");
        Utils.typeText(_lastName, "Test");
        Utils.typeText(_email, "xyz" + Utils.dateStamp() + "@gmail.com");
        Utils.typeText(_companyName, "ST");
        Utils.typeText(_password, "123456");
        Utils.typeText(_confirmPassword, "123456");

        //click on Register button.
        Utils.clickOnElement(_register);
    }

}
