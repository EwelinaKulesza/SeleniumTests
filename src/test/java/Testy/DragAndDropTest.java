package Testy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

    @Test
    public void dragAndDrop() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index/");
        WebElement elementToDrop = driver.findElement(By.id("draggable"));
        WebElement dropZone = driver.findElement(By.id("droptarget"));

        Actions action = new Actions(driver);
        action.dragAndDrop(elementToDrop, dropZone).build().perform();
        action.doubleClick(elementToDrop).build().perform();
    }
}
