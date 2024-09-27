import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class autocomplete2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D://Selenium_jars_and_drivers//drivers//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);


        WebElement name = driver.findElement(By.id("autocomplete"));
        name.sendKeys("476 Aylmer Avenue");


    }
}
