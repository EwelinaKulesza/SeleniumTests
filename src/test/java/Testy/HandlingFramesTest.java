package Testy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class HandlingFramesTest {

        @Test
        public void handlingFramesTest(){
            System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("C:\\Users\\Snorlax\\Desktop\\Nowy folder (4)\\iFrameTest.html");
            driver.switchTo().frame(0);
            WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
            clickOnMeButton.click();
            driver.switchTo().alert().accept();
            List<WebElement> headers = driver.findElements(By.tagName("h1"));
            System.out.println(headers.size());
            System.out.println(headers.get(0).getText());
            driver.switchTo().defaultContent();

        }
    }

