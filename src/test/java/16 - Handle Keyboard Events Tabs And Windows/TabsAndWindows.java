package HandleKeyboardEventsTabsAndWindows;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TabsAndWindows {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");

        //driver.switchTo().newWindow(WindowType.TAB); // opens new tab
        driver.switchTo().newWindow(WindowType.WINDOW); // opens new window

        driver.get("https://text-compare.com/");

        




        

    }
}
