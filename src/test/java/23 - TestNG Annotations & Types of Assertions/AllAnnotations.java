package day43;

import org.testng.annotations.*;

public class AllAnnotations {

    @BeforeSuite
    void bs(){
        System.out.println("this is BeforeSuite");
    }

    @AfterSuite
    void as(){
        System.out.println("this is AfterSuite");
    }

    @BeforeTest
    void bt(){
        System.out.println("this is BeforeTest");
    }

    @AfterTest
    void at(){
        System.out.println("this is AfterTest");
    }

    @BeforeClass
    void bc(){
        System.out.println("this is BeforeClass");
    }

    @AfterClass
    void ac(){
        System.out.println("this is AfterClass");
    }

    @BeforeMethod
    void bm(){
        System.out.println("this is BeforeMethod");
    }

    @AfterMethod
    void am(){
        System.out.println("this is AfterMethod");
    }

    @Test
    void t1(){
        System.out.println("this is t1");
    }

    @Test
    void t2(){
        System.out.println("this is t2");
    }






}
