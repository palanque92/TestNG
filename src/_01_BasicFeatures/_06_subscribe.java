package _01_BasicFeatures;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _06_subscribe extends BaseDriver {

    By link = By.linkText("Newsletter");
    By yes = By.xpath("//input[@type='radio']");
    By no = By.xpath("(//input[@type='radio'])[2]");
    By cnt = By.xpath("//input[@type='submit']");

    @Test (priority = 1)
    void subscribeNewsYes ()
    {
        WebElement newsLetter = driver.findElement(link);
        newsLetter.click();

        WebElement radioButtonyes = driver.findElement(yes);
        radioButtonyes.click();

        WebElement continiue = driver.findElement(cnt);
        continiue.click();

        Tools.successMessageValidation();

    }
    @Test (priority = 2)
    void subscribeNewsNo ()
    {
        WebElement newsLetter = driver.findElement(link);
        newsLetter.click();

        WebElement radioButtonno = driver.findElement(no);
        radioButtonno.click();

        WebElement continiue = driver.findElement(cnt);
        continiue.click();

        Tools.successMessageValidation();
    }
    @Test (priority = 3)
    void subscribeFunctionForBoth ()
    {
        WebElement newsLetter = driver.findElement(link);
        newsLetter.click();

        WebElement radioButtonyes = driver.findElement(yes);
        WebElement radioButtonno = driver.findElement(no);

        if (radioButtonyes.isSelected())
            radioButtonno.click();
        else
            radioButtonyes.click();

        WebElement continiue = driver.findElement(cnt);
        continiue.click();

        Tools.successMessageValidation();

    }
}
