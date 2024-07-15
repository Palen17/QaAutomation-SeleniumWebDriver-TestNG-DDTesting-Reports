package CapturescreenshotsHandleSSLHeadlessbrowserBlockingAdsChromeExtensions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScreenshots {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //1) Full page screenshot
        /*
        TakesScreenshot ts = (TakesScreenshot) driver;

        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png"); //E:\Curso-QA-Automation\seleniumwebdriver\screenshots
        sourcefile.renameTo(targetFile); //copy sourcefile to target file
        */

        //2) Capture screenshot of a specific seccion
        /*
        WebElement featureProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourceFIle = featureProducts.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir") + "\\screenshots\\featureProducts.png"); //E:\Curso-QA-Automation\seleniumwebdriver\screenshots
        sourceFIle.renameTo(targetFile); //copy sourcefile to target file

         */

        //3) Capture the screenshot of a webelement
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourceFIle = logo.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir") + "\\screenshots\\logo.png"); //E:\Curso-QA-Automation\seleniumwebdriver\screenshots
        sourceFIle.renameTo(targetFile); //copy sourcefile to target file

        driver.quit();


    }
}
