package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    void test(){
        //Assert.assertEquals("123", 123);
        //Assert.assertNotEquals("123", 123);
        //Assert.assertTrue(true);
        //Assert.assertTrue(1==2);
        //Assert.assertFalse(true);

        Assert.fail();

    }
}
