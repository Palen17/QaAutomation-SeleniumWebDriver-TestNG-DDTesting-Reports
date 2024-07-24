package day41;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class FDCalculator {
    public static void main(String[] args) throws IOException, InterruptedException {

        ChromeOptions options = new ChromeOptions();

        File file = new File("E:\\Curso-QA-Automation\\seleniumwebdriver\\uBlock-Origin-Chrome-Web-Store.crx");

        options.addExtensions(file);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
        driver.manage().window().maximize();

        String filePath = System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";

        int rows = ExcelUtils.getRowCount(filePath, "Sheet1");

        for (int i = 1; i <= rows; i++){

            //1) read data from excel
            String pric = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
            String rateOfInterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
            String per1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
            String per2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
            String frecuency = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);

            String exp_mvalue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);


            //2) pass above data into application
            driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
            driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
            driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
            Select perDopDown = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
            perDopDown.selectByVisibleText(per2);

            Select frecuencyDropDown = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
            frecuencyDropDown.selectByVisibleText(frecuency);

            driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click(); //Click on calculate

            //3) validation
            String actualMValue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

            if (Double.parseDouble(exp_mvalue) == Double.parseDouble(actualMValue)){
                System.out.println("Test passed");
                ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
                ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
            }else {
                System.out.println("Test Failed");
                ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
                ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
            }

            Thread.sleep(3000);
            driver.findElement(By.xpath("//img[@class='PL5']")).click();


        } //ending of loop

        driver.quit();

    }
}
