package ee.hm.dop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaticPage {
    public void About(WebDriver driver) {
        driver.findElement(By.cssSelector(".btn.btn-default")).click();
    }

    public void Help(WebDriver driver) {
        driver.findElement(By.cssSelector(".btn.btn-default")).click();
    }

}
