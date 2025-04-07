package Gun02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _01_EditAccount extends BaseDriver {
    By link = By.linkText("Edit Account");
    By firstName = By.xpath("//input[@name='firstname']");
    By lastName = By.id("input-lastname");
    By submitButton = By.cssSelector("input[type='submit']");

    @Test
    void editAccount()
    {
        editAccountTest("omer2","boncuk2");
        Tools.Bekle(1);
        editAccountTest("omer","boncuk");
    }


    void editAccountTest (String ad,String soyad)
    {
        WebElement editAc = driver.findElement(link);
        editAc.click();

        WebElement fName = driver.findElement(firstName);
        fName.clear();
        fName.sendKeys(ad);

        WebElement lName = driver.findElement(lastName);
        lName.clear();
        lName.sendKeys(soyad);

        WebElement btnSubmit = driver.findElement(submitButton);
        btnSubmit.click();

        Tools.successMessageValidation();


    }


}
