package Project;

import Utility.BaseDriver;
import Utility.BaseDriverParameters;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static Utility.BaseDriver.driver;

public class _01_Elements {

    public _01_Elements ()
    {
        PageFactory.initElements(BaseDriverProject.driver,this);
    }

    // Register

    @FindBy(xpath = "//input[@type='radio']")
    public WebElement radioBuutton;

    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement lastName;

    @FindBy(name = "DateOfBirthDay")
    public WebElement BrightDay;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement BrightMonth;

    @FindBy(name = "DateOfBirthYear")
    public WebElement BrightYear;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(id = "Company")
    public WebElement company;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement rePassword;

    @FindBy(id = "register-button")
    public WebElement registerBttn;

    // log in

    @FindBy(linkText = "Log in")
    public WebElement logIn;

    @FindBy(xpath = "//input[@class='email']")
    public WebElement email1;

    @FindBy(xpath = "//input[@class='password']")
    public WebElement password1;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement loginBtnn;

    @FindBy(linkText = "Log out")
    public WebElement logOut;



}

