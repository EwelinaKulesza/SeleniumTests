package Testy;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTests {
    @Test
    public void findingElementsTests(){

        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("C:\\Users\\Snorlax\\Desktop\\Nowy folder (4)\\Test.html");
        WebElement firstElement = driver.findElement(By.id("fname"));
        WebElement secondElement = driver.findElement(By.name("fname"));
        WebElement clickOnMeB = driver.findElement(By.id("clickOnMe"));
        WebElement w3schoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement googleLink = driver.findElement(By.partialLinkText("Weird"));
        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));

        WebElement clickOnMeCssButton = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement links = driver.findElement(By.cssSelector("a"));
        WebElement tdFirstChild = driver.findElement(By.cssSelector("td:first-child"));
        WebElement clickOnMeXpathButton = driver.findElement(By.xpath("//button"));
        WebElement linkXpeth = driver.findElement(By.xpath("//a"));
        WebElement topSecretXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement topSecretXpath2 = driver.findElement(By.xpath("//*[@class='topSecret']"));
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        driver.findElement(By.id("newPage")).click();
        driver.quit();//zamyka wszystkie okna
    }
}

