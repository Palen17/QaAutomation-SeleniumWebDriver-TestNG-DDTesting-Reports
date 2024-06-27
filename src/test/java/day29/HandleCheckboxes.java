package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckboxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) select checkbox
        //WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
        //System.out.println("Before selection: " + checkbox.isSelected());
        //driver.findElement(By.xpath("//input[@id='sunday']")).click(); //select checkbox
        //System.out.println("After selection: " + checkbox.isSelected());

        //2)capturing all the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println("Number of checkboxes: " + checkboxes.size());

        //3)Selecting all the checkboxes
        /*
        for (int i = 0; i<checkboxes.size(); i++){
            checkboxes.get(i).click();
        }
        */


        /*
        for (WebElement chkbox:checkboxes){
            chkbox.click();
        }
        */

        //4) select last 3 chackboxes
        //total number of chack boxes - how many checkboxes do you want to select = starting index
        /*
        for (int i = 4; i<checkboxes.size(); i++) //total 7, want to select last 3 chackboxes
        {
            checkboxes.get(i).click();
        }
         */

        //5) select first 3 check boxes
        /*
        for (int i = 0; i<3; i++){
            checkboxes.get(i).click();
        }

         */



        //6) Select/unselect checkboxes
/*
        for (WebElement chbox:checkboxes){
            if (chbox.isSelected()){
                chbox.click();
            }
            else{
                chbox.click();
            }
        }

        Thread.sleep(5000);

        for (WebElement chbox:checkboxes){
            if (chbox.isSelected()){
                chbox.click();
            }
            else{
                chbox.click();
            }
        }

 */

        //7) select specific chackboxes randomly
        /*
        for (int i=0; i<checkboxes.size();i++){
            if (i == 1 || i==3 || i==6){
                checkboxes.get(i).click();
            }
        }

         */

        String weekname = "Wednesday";

        switch (weekname){
            case "Sunday" : driver.findElement(By.xpath("//label[@for='sunday']")).click();
                break;

            case "Monday" : driver.findElement(By.xpath("//label[@for='monday']")).click();
                break;

            case "Tuesday" : driver.findElement(By.xpath("//label[@for='tuesday']")).click();
                break;

            case "Wednesday" : driver.findElement(By.xpath("//label[@for='wednesday']")).click();
                break;

            case "Thursday" : driver.findElement(By.xpath("//label[@for='thursday']")).click();
                break;

            case "Friday" : driver.findElement(By.xpath("//label[@for='friday']")).click();
                break;

            case "Saturday" : driver.findElement(By.xpath("//label[@for='saturday']")).click();
                break;

            default:
                System.out.println("Invalid week name");
        }


    }
}
