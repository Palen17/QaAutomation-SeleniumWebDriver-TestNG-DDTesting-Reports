package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionsDemo {

    @Test
    void testTitle(){
        String exp_title= "Opencart";
        String act_title= "Opencart";
/*
        if (exp_title.equals(act_title)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }
 */
        //Assert.assertEquals(exp_title, act_title);

        if (exp_title.equals(act_title)){
            System.out.println("Test passed");
            Assert.assertTrue(true);
        }else {
            System.out.println("Test Failed");
            Assert.assertTrue(false);
        }
    }
}
