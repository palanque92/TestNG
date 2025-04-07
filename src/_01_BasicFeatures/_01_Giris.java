package _01_BasicFeatures;

import org.testng.annotations.Test;

public class _01_Giris {
    // If no order is given, method names will work alphabetically.
    @Test(priority = 1)
    void webSideOpen (){
        System.out.println("Web side is opened.");
    }
    @Test(priority = 2)
    void SingIn (){
        System.out.println("login has been done.");
    }
    @Test(priority = 3)
    void closeTheDriver (){
        System.out.println("the drive was turned off and exited.");
    }
}
