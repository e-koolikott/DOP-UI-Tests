package ee.hm.dop.page;

import org.openqa.selenium.By;

public class Footer extends Page {
    // footer method

    // HTM logo in the footer, expected to lead to HTM page.
    private By htmLogo = By.className("navbar-brand");

    public void clickHTMLogo() {
        getDriver().findElement(htmLogo).click();
    }

}
