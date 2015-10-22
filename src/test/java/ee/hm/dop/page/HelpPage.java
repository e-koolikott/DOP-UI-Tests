package ee.hm.dop.page;

import org.openqa.selenium.By;

public class HelpPage extends Page {

    private By mainTitle = By.xpath("//div/h1");

    public String getMainTitle() {
        return getDriver().findElement(mainTitle).getText();
    }

}
