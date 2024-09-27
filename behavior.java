import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class behavior {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D://Selenium_jars_and_drivers//drivers//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Kunal");

        driver.findElement(By.id("last-name")).sendKeys("Panchal");

        driver.findElement(By.id("job-title")).sendKeys("ML Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.id("select-menu")).sendKeys("0-1");

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("03/03/2002");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector("a[role='button']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Update this line
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
        String alertText = alert.getText();
        if (!alertText.equals("The form was successfully submitted!")) {
            throw new AssertionError("Test failed: Expected alert text not found");
        } else {
            System.out.println("Test passed: The form was successfully submitted!");
        }
    }
}
