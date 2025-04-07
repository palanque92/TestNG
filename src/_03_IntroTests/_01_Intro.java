package _03_IntroTests;

import org.testng.annotations.*;

public class _01_Intro {
    /*

     @BeforeTest
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
                 @Test1 method
                 @Test2 method
             @AfterMethod
           @AfterClass
         @AfterGroup
       @AfterTest
     @AfterSuit

   */

    @BeforeSuite
    void bSuite(){System.out.println("Before Suit");}

    @BeforeTest
    void bTest(){System.out.println("Before Test");}

    @BeforeGroups
    void bGroups(){System.out.println("Before Groups");}

    @BeforeClass
    void bClass(){System.out.println("Before Class");}

    @BeforeMethod
    void bMethod(){System.out.println("Before Methods");}

    @Test
    void Intro_1_Test1(){System.out.println("intro 01 test 1");}

    @Test
    void Intro_1_Test2(){System.out.println("intro 02 test 2");}

    @AfterMethod
    void aMethod(){System.out.println("After Method");}

    @AfterClass
    void aClass(){System.out.println("After Class");}

    @AfterGroups
    void aGroups(){System.out.println("After Groups");}

    @AfterTest
    void aTest(){System.out.println("After Test");}

}
