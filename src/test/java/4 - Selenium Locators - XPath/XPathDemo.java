package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //Xpath with single attribute:
        //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Iphone");

        //Xpath with multiple attributes:
        //driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Iphone");

        //Xpath with 'and' operator:
        //driver.findElement((By.xpath("//input[@name='search' and @placeholder='Search']"))).sendKeys("Iphone");

        //Xpath with 'or' operator:
        //driver.findElement((By.xpath("//input[@name='search' or @placeholder='xyz']"))).sendKeys("Iphone");

        //Xpath with text - inner text <abc c="123"> inner text </abc>:
        //driver.findElement(By.xpath("//*[text()='MacBook']")).click();

        //boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        //System.out.println(displayStatus);

        //String value =driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
        //System.out.println(value);

        //XPath with contains():
        //driver.findElement((By.xpath("//input[contains(@placeholder,'Sea')]"))).sendKeys("Iphone");

        //XPath with start-with():
        //driver.findElement((By.xpath("//input[starts-with(@placeholder,'Sea')]"))).sendKeys("Iphone");

        //chained xpath:
        //boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        //System.out.println(status);

    }


}
