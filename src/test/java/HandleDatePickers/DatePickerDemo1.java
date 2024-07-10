package HandleDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo1 {

    //Selecting future date
    static void selectFutureDate(WebDriver driver, String month, String year, String day){

        while (true){
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year

            if (currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

        //select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));

        for (WebElement date:allDates){
            if (date.getText().equals(day)){
                date.click();
                break;
            }

        }

    }

    //Selecting past date
    static void selectPastDate(WebDriver driver, String month, String year, String day){

        while (true){
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year

            if (currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }

        //select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));

        for (WebElement date:allDates){
            if (date.getText().equals(day)){
                date.click();
                break;
            }

        }

    }


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //Switch to frame
        driver.switchTo().frame(0);


        //method1: using sendkeys()
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); //mm/dd/yyyy

        //Method2: using date picker
        //Expected data
        String year = "2025";
        String month = "May";
        String day = "9";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();


        selectFutureDate(driver, month, year, day);

    }
}
