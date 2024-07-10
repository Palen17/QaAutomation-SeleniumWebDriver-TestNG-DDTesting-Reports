package HandleDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

public class DatePickerDemo2 {

    static Month converthMonth(String month){
        HashMap<String, Month> monthMap = new HashMap<String, Month>();

        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        Month vmonth = monthMap.get(month);
        if (vmonth == null){
            System.out.println("Invalid Month");
        }

        return vmonth;
    }

    static void selectDate(WebDriver driver, String requiredyear, String requiredMonth, String requiredDate){

        //Select year
        WebElement yearDropdown = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText(requiredyear);

        //Select month
        while (true){

            String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            //convert requiredMonth & displayMonth into Month objects
            Month expectedMonth = converthMonth(requiredMonth);
            Month currentMonth = converthMonth(displayMonth);


            //Compare Months
            int result = expectedMonth.compareTo(currentMonth);
            //0 months are equals
            //>0 future month
            //<0 past month

            if (result<0){
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            }
            if (result>0){
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
            else {
                break;
            }


        }

        //date selection
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        for (WebElement dt:allDates){
            if (dt.getText().equals(requiredDate)){
                dt.click();
                break;
            }
        }



    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Input
        String requiredyear = "2026";
        String requiredMonth = "June";
        String requiredDate = "10";

        //Switch to frame
        driver.switchTo().frame("frame-one796456169");
        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

        selectDate(driver, requiredyear, requiredMonth, requiredDate);






    }
}
