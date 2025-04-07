package _03_IntroTests;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son adresi siliniz.
 */

public class _00_AddressFunctionality extends BaseDriver {
    @Test
    void AddAddress()
    {
        Actions actions = new Actions(driver);
        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        actions.click(addressBook).perform();
        // //div[@class='pull-right']
        WebElement adressbttn = driver.findElement(By.xpath("//div[@class='pull-right']"));
        actions.click(adressbttn).perform();
        // //input[@name='firstname']
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        actions.click(firstName).perform();
        actions.sendKeys("Fener").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("bahce").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("BESTTEST").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Azuolyno 9 g").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Azuolyno 10 g").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("paris").perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("13200").perform();

        WebElement country = driver.findElement(By.id("input-country"));
        Select countrySelect = new Select(country);
        countrySelect.selectByVisibleText("Turkey");

        WebElement city = driver.findElement(By.id("input-zone"));
        Select citySelect = new Select(city);
        citySelect.selectByVisibleText("Adana");

        WebElement radiobttn = driver.findElement(By.xpath("//input[@name='default']"));
        radiobttn.click();

        WebElement continuebttn = driver.findElement(By.xpath("//input[@value='Continue']"));
        continuebttn.click();


    }
    @Test (dependsOnMethods = {"AddAddress"})
    void editAddress ()
    {
        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Edit"));  //*[text()='Edit']
        WebElement sonEdit= editAll.get(editAll.size() - 1); // sonuncu edit
        System.out.println("editAll = " + editAll.size());
        sonEdit.click();

        WebElement firsName=driver.findElement(By.id("input-firstname"));
        firsName.clear();
        firsName.sendKeys("Mehmet");

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys("Yılmaz");

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();
    }
    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress()
    {
        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> deleteAll=driver.findElements(By.linkText("Delete"));
        WebElement sonDelete= deleteAll.get(deleteAll.size() - 2);
        sonDelete.click();

        Tools.successMessageValidation();
    }
}
