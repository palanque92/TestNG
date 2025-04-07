package _05_DataProviderTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test(dataProvider = "getData")
    void LoginTest(String userName,String password)
    {
        System.out.println("userName = " + userName+",password ="+password);
    }



    @DataProvider
    public Object[][] getData()
    {
        Object[][] logins={
                {"Omer","12312414"},
                {"Mikail","123141231"},
                {"Enes","14155525"},
                {"Alec","6452341"}
        };
        return logins;
    }
}
