package day44;

import org.testng.annotations.Test;

public class SingUpTests {

    @Test(priority = 1, groups = {"regression"})
    void singupbyemail(){
        System.out.println("SingUp by email");
    }

    @Test(priority = 2, groups = {"regression"})
    void singupbyfacebookl(){
        System.out.println("SingUp by facebook");
    }

    @Test(priority = 3, groups = {"regression"})
    void singupbytwitter(){
        System.out.println("SingUp by twitter");
    }
}
