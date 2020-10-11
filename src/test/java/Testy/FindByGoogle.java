package Testy;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FindByGoogle {

    @FindBy(name = "q")
    private WebElement searchInput;

    @Test
    public void google() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        PageFactory.initElements(driver, this);
        searchInput.sendKeys("Selenium");
    }
}
