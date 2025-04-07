package _01_BasicFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Assertions {

    @Test
    void EqualOrnek()
    {
        String s1="Merhaba";
        String s2="Merhaba";
                          // actual , expected , Message (optional)
        Assert.assertEquals(s1,s2,"Karsilastirma sonucu"); // hard assertion,soft assertion

    }
    @Test
    void notEqualOrnek()
    {
        String s1="Merhaba";
        String s2="Merhaba";
        // actual , expected , Message (optional)
        Assert.assertNotEquals(s1,s2,"Karsilastirma sonucu");

    }
    @Test
    void TrueOrnek()
    {
        int s1=55;
        int s2=56;
        // actual , expected , Message (optional)
        Assert.assertTrue(s1==s2,"Karsilastirma sonucu");

    }
    @Test
    void NullOrnek()
    {
        String s1="Omer";

        // actual , expected , Message (optional)
        Assert.assertNull(s1,"Karsilastirma sonucu"); // hard assertion,soft assertion

    }
    @Test
    void direkFail()
    {
        int a=55;

        if (a == 55)
            Assert.fail();

    }
}
