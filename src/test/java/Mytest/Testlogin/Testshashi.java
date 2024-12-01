package Mytest.Testlogin;

import Base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Testshashi extends Baseclass {
    @Test
    public void  LoginTest()
    {
       WebElement ele= driver.findElement(By.xpath("//p[.='PracticeAutomationHere']"));
       Assert.assertEquals(ele.isDisplayed(),true);
        driver.findElement(By.xpath("(//a[text()=' Selenium143 '])[1]")).click();
    }

}
