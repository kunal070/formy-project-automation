import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertswitch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://Selenium_jars_and_drivers//drivers//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement button = driver.findElement(By.id("alert-button"));
        button.click();
        Alert a = driver.switchTo().alert();
        a.accept();
    }
}

