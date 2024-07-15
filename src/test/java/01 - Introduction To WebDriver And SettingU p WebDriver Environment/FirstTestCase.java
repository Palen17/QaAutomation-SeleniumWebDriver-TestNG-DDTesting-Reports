package day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
TEST CASE
------------
    1)Launch browser
    2)Open URl https://demo.opencart.com/
    3)Validate title should be "Your Store"
    4)Close browser
 */

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main (String[] args){

        //1) launch browser
        //ChromeDriver driver = new ChromeDriver(); // Solo chrome
        WebDriver driver = new ChromeDriver();  //WebDriver sirve para todos los browsers

        //2) Open URl https://demo.opencart.com/

        driver.get("https://demo.opencart.com/");

        // 3)Validate title should be "Your Store"

        String actualTitle = driver.getTitle();

        if (actualTitle.equals("Your Store")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        //4) Close browser
        //driver.close();
        driver.quit();





    }
}
