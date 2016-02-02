package ee.hm.dop.page;

import org.openqa.selenium.By;

import ee.hm.dop.helpers.PageHelper;

public class HtmPage extends Page {

    private By htmText = By.xpath("//a[contains(@class, 'otselink')]");

    public String getTextOnHtmPage() {
        PageHelper.waitForVisibility(htmText);
        return getDriver().findElement(htmText).getText();
    }

}
