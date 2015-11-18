package ee.hm.dop.components;

import org.openqa.selenium.By;

import ee.hm.dop.helpers.PageHelper;
import ee.hm.dop.page.HtmPage;

public class Footer extends PageComponent {
    // footer method

    // HTM logo in the footer, expected to lead to HTM page.
    private By htmLogo = By.id("exifviewer-img-2");

    public HtmPage clickHTMLogo() {
        PageHelper.waitFor(htmLogo);
        getDriver().findElement(htmLogo).click();
        return new HtmPage();
    }

}
