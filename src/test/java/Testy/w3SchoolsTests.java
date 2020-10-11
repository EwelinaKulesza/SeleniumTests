package Testy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class w3SchoolsTests {

    @Test
    public void moveOverElement() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).build().perform();
    }
}
