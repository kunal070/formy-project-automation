import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://Selenium_jars_and_drivers//drivers//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement button = driver.findElement(By.id("modal-button"));
        button.click();

        WebElement button1 = driver.findElement(By.id("close-button"));

        Thread.sleep(1000);

        JavascriptExecutor temp = (JavascriptExecutor)driver;
        temp.executeScript("arguments[0].click();",button1);

    }
}

