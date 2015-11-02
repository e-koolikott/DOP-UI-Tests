package ee.hm.dop.page;

import org.openqa.selenium.By;

public class HtmPage extends Page {

    private By htmText = By.xpath("//a[contains(@class, 'otselink')]");

    public String getTextOnHtmPage() {
        return getDriver().findElement(htmText).getText();
    }

}
