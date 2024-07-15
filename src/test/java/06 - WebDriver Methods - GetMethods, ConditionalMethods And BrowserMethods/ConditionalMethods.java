package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        //isDisplayed
        //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        //System.out.println("Display status of logo: " + logo.isDisplayed());

        //isEneabled()
        //boolean status = driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
        //System.out.println(status);

        //isSelected()
        WebElement male_lb = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_lb = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Before selection:");
        System.out.println("Male: " + male_lb.isSelected());
        System.out.println("Female: " + female_lb.isSelected());

        System.out.println(" ");

        System.out.println("After female selection:");
        System.out.println("Male: " + male_lb.isSelected());
        female_lb.click();
        System.out.println("Female: " + female_lb.isSelected());

        boolean newsletterStatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
        System.out.println("newsletterStatus: " + newsletterStatus);

    }
}
