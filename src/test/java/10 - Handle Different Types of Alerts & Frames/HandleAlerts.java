package day30;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //1) Normal ok button
        /*
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Alert myalert = driver.switchTo().alert();

        myalert.accept();

         */

        //2) Confirmation Alert - OK & Cancel
        /*
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept(); // Close alert window using Ok button
         */
        //driver.switchTo().alert().dismiss(); // Close alert window using Cancel button

        //3) Promp alert - Input box
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert myalert = driver.switchTo().alert();
        System.out.println("Text mdg on alert: " + myalert.getText());
        myalert.sendKeys("Hol");
        myalert.accept();

        String res = driver.findElement(By.xpath("//p[@id='result']")).getText();
        if (res.contains("Hola")){
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }
}
