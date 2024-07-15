package CapturescreenshotsHandleSSLHeadlessbrowserBlockingAdsChromeExtensions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*
TEST CASE
------------
    1)Launch browser
    2)Open URl https://demo.opencart.com/
    3)Validate title should be "Your Store"
    4)Close browser
 */

public class HeadlessTesting {

    public static void main (String[] args){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // setting for headless mode of execution

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.nopcommerce.com/");


        String actualTitle = driver.getTitle();

        if (actualTitle.equals("nopCommerce demo store")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

    }
}
