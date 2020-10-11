package Testy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class ActionsOnElements {

    @Test
    public void actionsOnElements() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Snorlax\\Desktop\\Nowy folder (4)\\Test.html");
        WebElement firstElement = driver.findElement(By.id("fname"));
        if (firstElement.isEnabled()) {
            System.out.println("Element jest dostępny");
        }
        firstElement.click();

        firstElement.sendKeys("Ewelina");
        firstElement.clear();
        firstElement.sendKeys("Laura");
        System.out.println("Wartość to " + firstElement.getAttribute("value"));

        Select carSelect = new Select(driver.findElement(By.tagName("select")));
        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println("Wartość label to " + label.getText());
        carSelect.selectByIndex(2);
        carSelect.selectByVisibleText("Mercedes");
        carSelect.selectByValue("audi");

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        Thread.sleep(5000);
        checkbox.click();
        if (checkbox.isSelected()) {
            System.out.println("Checkbox jest zaznaczony");
        }

        WebElement radioButton = driver.findElement(By.xpath("//input[@value='male']"));
        radioButton.click();

        WebElement paragraph = driver.findElement(By.className("topSecret"));
        System.out.println("Mój tekst to " + paragraph.getAttribute("textContent"));
        if (paragraph.isDisplayed()) {
            paragraph.click();
        } else {
            System.out.println("Element nie jest widoczny");
        }

        WebElement image = driver.findElement(By.id("smileImage"));
        System.out.println(image.getAttribute("naturalHeight"));

    }

}
