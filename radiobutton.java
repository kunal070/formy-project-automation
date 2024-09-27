import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","D://Selenium_jars_and_drivers//drivers//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");

//        three differenet method

//      1st method
        WebElement fn = driver.findElement(By.id("checkbox-1"));
        fn.click();
//      2nd method
        WebElement ln = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        ln.click();
//      3rd method
        WebElement job = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
        job.click();




    }

}
