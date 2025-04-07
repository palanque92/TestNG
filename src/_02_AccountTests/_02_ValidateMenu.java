package _02_AccountTests;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _02_ValidateMenu extends BaseDriver {


    @Test
    void menuTest()
    {
        List<WebElement>menuActual=driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

        // for (WebElement w:menuActual) {
        //     System.out.println(w.getText());

        List <String> menuExpected = new ArrayList<>();
        menuExpected.add("Desktops");
        menuExpected.add("Laptops & Notebooks");
        menuExpected.add("Components");
        menuExpected.add("Tablets");
        menuExpected.add("Software");
        menuExpected.add("Phones & PDAs");
        menuExpected.add("Cameras");
        menuExpected.add("MP3 Players");

        for (int i = 0; i < menuExpected.size(); i++)
            Assert.assertEquals(menuActual.get(i).getText(), menuExpected.get(i),"The menu is not as expected");


    }
}
