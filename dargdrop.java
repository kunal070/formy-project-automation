import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class dargdrop {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D://Selenium_jars_and_drivers//drivers//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement drag = driver.findElement(By.id("image"));

        WebElement drop = driver.findElement(By.id("box"));

        Actions a = new Actions(driver);
        a.dragAndDrop(drag,drop).build().perform();




    }
}
