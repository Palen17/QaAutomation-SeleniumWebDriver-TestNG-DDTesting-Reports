package HandleKeyboardEventsTabsAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenLinkInNewTab {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));

        //CTRL+Click
        act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();

        //Switching to registration page
        List<String> ids = new ArrayList(driver.getWindowHandles());

        driver.switchTo().window(ids.get(1)); //switch to registration page





        

    }
}
