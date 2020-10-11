package Testy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitTest {

    @FindBy(name = "q")
    private WebElement searchInput;

    @Test
    public void dragAndDrop() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
        driver.get("C:\\Users\\Snorlax\\Desktop\\Nowy folder (4)\\Waits.html");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(6000);
        WebElement paragraph = driver.findElement(By.tagName("p"));
        Assert.assertEquals(paragraph.getText(),"Dopiero się pojawiłem!");
    }

    public void waitForWebElement(By locator) {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
