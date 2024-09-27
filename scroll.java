import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class scroll {
        public static void main(String[] args)  {
            System.setProperty("webdriver.chrome.driver","D://Selenium_jars_and_drivers//drivers//Chrome//chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://formy-project.herokuapp.com/scroll");

            WebElement name = driver.findElement(By.id("name"));
            Actions action = new Actions(driver);
            action.moveToElement(name);
            name.sendKeys("Kunal Panchal");
            driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
            WebElement date = driver.findElement(By.id("date"));
            date.sendKeys("09/03/2002");

    }
}
