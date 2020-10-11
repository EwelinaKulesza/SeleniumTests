package Testy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MethodsOnElements {

    @Test
    public void switchingWindows() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Snorlax\\Desktop\\Nowy folder (4)\\Test.html");

        checkIfElementExist(By.tagName("a"), driver);
        checkIfElementExist(By.tagName("asasa"), driver);

        WebElement newPageButton = driver.findElement(By.id("newPage"));
        String currentWindowName = driver.getWindowHandle();
        newPageButton.click();
        switchToNewWindow(driver,currentWindowName);
        System.out.println("Tytuł strony to " + driver.getTitle());
        System.out.println("Obecny URL to " + driver.getCurrentUrl());
        driver.switchTo().window(currentWindowName);
        driver.findElement(By.name("username")).sendKeys("Mouse");
    }

    private void switchToNewWindow (WebDriver driver, String currentWindowName){
        System.out.println("Wartość dla obecnego okna " + currentWindowName);
        Set<String> window = driver.getWindowHandles();
        System.out.println("Ilość okien przeglądarki " + window.size());

        for(String widow : window){
            if(!window.equals(currentWindowName)) {
                driver.switchTo().window(widow);
            }
        }
    }

    public boolean checkIfElementExist(By locator, WebDriver driver) {
        if (driver.findElements(locator).size() > 0) {
            System.out.println("Element istnieje na stronie");
            return true;
        }
        return false;
    }

    public void checkIfElementExist(WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            System.out.println("Element istnieje na stronie");
        } catch (NoSuchElementException exc) {
            System.out.println("Element nie istnieje");
        }
    }
}