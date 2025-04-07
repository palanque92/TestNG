package _06_POM;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_PlaceOrderElements {



    public _02_PlaceOrderElements()
    {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//input[@class='form-control input-lg']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    public WebElement searchButton;

    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement firstIpod;

    @FindBy(linkText = "shopping cart")
    public WebElement shoppingCart;

    @FindBy(linkText = "Checkout")
    public WebElement checkOut;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement firstContiniue;

    @FindBy(xpath = "(//input[@value='Continue'])[2]")
    public WebElement secondContiniue;

    @FindBy(xpath = "(//input[@value='Continue'])[3]")
    public WebElement thirdContiniue;

    @FindBy(xpath = "(//input[@value='Continue'])[4]")
    public WebElement fourthContiniue;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "(//input[@value='Continue'])[4]")
    public WebElement fifthContiniue;

    @FindBy(xpath = "//input[@value='Confirm Order']")
    public WebElement sixContiniue;

    @FindBy(xpath = "//div[@id='content']/h1")
    public WebElement s2;


}
