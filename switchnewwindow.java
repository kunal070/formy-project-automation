import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class switchnewwindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://Selenium_jars_and_drivers//drivers//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        String w1 = driver.getWindowHandle();

        for(String w2 : driver.getWindowHandles()){
            driver.switchTo().window(w2);
        }

        driver.switchTo().window(w1);
        WebElement button = driver.findElement(By.id("new-tab-button"));
        button.click();
    }
    }

