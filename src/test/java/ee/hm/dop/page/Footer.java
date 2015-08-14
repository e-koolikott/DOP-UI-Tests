package ee.hm.dop.page;

import org.openqa.selenium.By;

public class Footer extends Page {

    public void clickHTMLogo() {
        getDriver().findElement(By.className("navbar-brand")).click();
    }

}
