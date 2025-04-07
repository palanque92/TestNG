package Project;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_POM extends BaseDriverProject {
    @Test(priority = 1)
    void Test1()
    {
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        _01_Elements elements = new _01_Elements();

        elements.radioBuutton.click();
        elements.firstName.sendKeys("Ali");
        elements.lastName.sendKeys("Veli");
        Select day = new Select(elements.BrightDay);
        day.selectByVisibleText("14");
        Select month = new Select(elements.BrightMonth);
        month.selectByValue("3");
        Select year = new Select(elements.BrightYear);
        year.selectByVisibleText("1923");
        elements.email.sendKeys("omer1234@gmail.com");
        elements.company.sendKeys("biliyseen");
        elements.password.sendKeys("omer1234");
        elements.rePassword.sendKeys("omer1234");
        elements.registerBttn.click();
    }
    @Test(priority = 3)
    void Test2()
    {
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        _01_Elements elements = new _01_Elements();

        elements.logIn.click();
        elements.email1.sendKeys("omer1234@gmail.com");
        elements.password1.sendKeys("omer1234");
        elements.loginBtnn.click();
        String s1 ="Welcome to our store";
        Assert.assertEquals(s1,"Welcome to our store","Login olunamadi");
        elements.logOut.click();

    }

    @Test(dataProvider = "logins",priority = 2)
    void Logins(String email,String password){

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        _01_Elements elements = new _01_Elements();

        elements.logIn.click();
        elements.email.sendKeys(email);
        elements.password.sendKeys(password);
        elements.loginBtnn.click();


        elements.email.clear();
        elements.password.clear();


    }
    @DataProvider(name = "logins")
    public Object[][] getData()
    {
        Object[][] logins={
                {"Alec","12312414"},
                {"Mikail","123141231"},
                {"Enes","14155525"},
        };
        return logins;
    }

}
